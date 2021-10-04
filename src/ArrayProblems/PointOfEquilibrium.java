package ArrayProblems;

import java.util.Arrays;

public class PointOfEquilibrium {

    public static int rangeQuery(int[] arr, int start, int end){
        if(start == 0)
            return arr[end];
        return arr[end] - arr[start - 1];
    }

    public static int f(int[] a){
        if(a.length < 3)
            return -1;

        //use prefix sum array that brings down time complexity
        //of solution to O(N)
        int[] prefixSum = new int[a.length];
        prefixSum[0] = a[0];
        for(int i = 1; i < a.length; i++)
            prefixSum[i] = prefixSum[i-1] + a[i];

        for(int i = 1; i < a.length - 1; i++){
            int leftVal = rangeQuery(prefixSum, 0,i-1);
            int rightVal = rangeQuery(prefixSum, i+1, a.length-1);

            if(leftVal == rightVal)
                return i;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[][] arr = {{1,8,3,7,10,2}, {1,5,3,1,1,1,1,1,1}, {2,1,1,1,2,1,7}, {1,2,3},
                {3,4,5,10},{1,2,10,3,4}};


        for(int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]) + " : " + f(arr[i]));
    }

}
