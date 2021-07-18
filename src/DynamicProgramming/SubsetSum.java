package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetSum {
    public static boolean isSubsetSum(int[] arr, int idx, int X){
        if(X == 0)
            return true;
        if(idx == 0)
            return false;

        //If number is greater, ignore it
        if(arr[idx-1] > X)
            return isSubsetSum(arr, idx-1, X);

        return isSubsetSum(arr, idx-1, X) ||
                isSubsetSum(arr, idx-1, X-arr[idx-1]);
    }

    public static boolean[][] isSubsetSumDP(int[] arr, int sum){
        int n = arr.length;

        //dp[i][j] states arr[0....i] has a subset which equals to j
        boolean[][] dp = new boolean[n + 1][sum + 1];


        for(int i = 0; i < n; i++)
            dp[i][0] = true;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sum; j++){
                // if the current element from arr[i] (at index i-1) are working with
                // is greater than current sum value, ignore it (copy prev values)
                if(arr[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
            }
        }

        /*for(boolean[] a : dp){
            for(boolean b : a){
                if(b)
                    System.out.print("T ");
                else
                    System.out.print("F ");
            }
            System.out.println();
        }*/

        return dp;
    }

    public static ArrayList<Integer> getSubsetSumDP(int[] arr, int sum){
        boolean[][] dp = isSubsetSumDP(arr, sum);
        int n = arr.length;

        if(!dp[n][sum])
            return null;
        else{
            int i = n;
            int j = sum;
            ArrayList<Integer> subset = new ArrayList<>();

            //Look at dp[i][j] and dp[i-1][j], they should be true and false
            //If both are true, simply go to the prev row

            while(i >= 1){
                if(dp[i][j] && !dp[i-1][j]) {
                    subset.add(arr[i - 1]);
                    j = j - arr[i-1];
                }

                i--;
            }

            /*for(boolean[] a : dp){
            for(boolean b : a){
                if(b)
                    System.out.print("T ");
                else
                    System.out.print("F ");
            }
            System.out.println();
        }*/

            return subset;
        }
    }

    //TODO : Implement Space Optimized variant


    public static void main(String[] args) {
        int[] arr = {1,8,5,13,24};
        int n = arr.length;
        int K = 1;

        //System.out.println(isSubsetSum(arr, arr.length, K));
        //System.out.println(isSubsetSumDP(arr, K)[n][K]);
        System.out.println(getSubsetSumDP(arr, K));
    }
}
