package DynamicProgramming;

public class ExpressSum {

    static int[] steps = {1, 2};

    //GeeksForGeeks Code for verification
    static int countWays(int n)
    {
        int DP[] = new int[n + 1];

        // base cases
        DP[0] = DP[1] = DP[2] = 1;
        DP[3] = 2;

        // iterate for all values from 4 to n
        for (int i = 4; i <= n; i++)
            DP[i] = DP[i - 1] + DP[i - 3]
                    + DP[i - 4];

        return DP[n];
    }


    static int myCountWays(int n){
        if(n < 0)
            return 0;
        else if(n == 0)
            return 1;

            int ans = 0;
            for(int step = 0; step < steps.length; step++)
                ans += myCountWays(n - steps[step]);
        

        return ans;

    }

    static boolean canSum(int num, int[] arr, int start){
        if(num == 0) return true;
        if(num < 0 || start == arr.length) return false;

        int i;
        boolean ans = false;
        for(i = start; i < arr.length; i++)
            ans = canSum(num - arr[i], arr, start + 1);

        return ans;
    }


    public static void main(String[] args) {
        int num = 4;
        int[] arr  = {2};
        //System.out.println(countWays(num));
        //System.out.println(myCountWays(num));
        System.out.println(canSum(num, arr, 0));
    }
}
