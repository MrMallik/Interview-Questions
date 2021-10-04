package ArrayProblems;

import java.util.*;


public class MaxSubarraySum {

    public static int maxSubArray(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxEndingHere = Math.max(nums[i], nums[i] + maxEndingHere);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }


    /**
     * Code Stolen from : https://www.geeksforgeeks.org/print-the-maximum-subarray-sum/
     * @param nums
     * @return
     */
    public static int maxSubArrayPrint(int[] nums){
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        int startIdx, endIdx = 0;
        ArrayList<Integer> subArrList = new ArrayList<>();


        for(int i = 1; i < nums.length; i++){
            maxEndingHere = Math.max(nums[i], nums[i] + maxEndingHere);

            if(maxSoFar < maxEndingHere){
                maxSoFar = maxEndingHere;
                endIdx = i;
            }
        }

        startIdx = endIdx;
        int maxSum = maxSoFar;

        while(startIdx > 0){
            maxSum -= nums[startIdx];

            if(maxSum == 0)
                break;

            startIdx--;
        }

        for(int i = startIdx; i <= endIdx; i++)
            subArrList.add(nums[i]);

        System.out.println(subArrList);

        return maxSoFar;
    }

    public static void main(String[] args) {
        //int[] arr = {-21, 2, 14, 5, -3, 1};
        int[] arr = {-1,-2,-3,-41,5};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArrayPrint(arr));
    }

}
