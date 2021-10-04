package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class LIS {
    public static int lisCount(int arr[]){
        int i, j;
        int dp[] = new int[arr.length];
        Arrays.fill(dp, 1);


        //dp[i] represents the longest subsequence ending with arr[i]
        //Now before adding 1 to dp[i], we have to check if the jth element is
        //less than ith element and adding 1 is indeed less than i
        for(i = 0; i < arr.length; i++) {
            for (j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[i] < dp[j] + 1)
                    dp[i] = dp[j] + 1;
            }
        }

        int ans = dp[0];
        for(int e : dp) {
            if (e > ans)
                ans = e;
        }

        int temp = ans;
        ArrayList<Integer> lis = new ArrayList<>();

        for(i = dp.length - 1; i >= 0; i--){
            if(dp[i] == temp ){
                temp--;
                lis.add(0,arr[i]);
            }
        }

        System.out.println(lis);

            return ans;
    }

    public static void main(String[] args) {
        //int[] arr = {5,6,4,1,2,3,16,9};
        int[] arr = {51,29,18,36,19,41,24,96};

        System.out.println(lisCount(arr));
    }
}
