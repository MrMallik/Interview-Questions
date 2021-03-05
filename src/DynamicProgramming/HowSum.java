package DynamicProgramming;

import java.util.ArrayList;

public class HowSum {
    static ArrayList<Integer> howSum(int num, int[] arr, ArrayList<Integer> ans, int start){
        if(num == 0) return new ArrayList<Integer>(); //return empty array
        if(num < 0 || start == arr.length) return null; //returning null means, we don't have to add prev value

        for(int i = start; i < arr.length; i++){
            if(howSum(num - arr[i], arr, ans, i+1) != null){
                ans.add(arr[i]);

                return ans;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int num = 0;
        //int[] arr = {7,2,3,4};
        int[] arr = {0,3,4,0};
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(howSum(num, arr, ans, 0));
    }
}
