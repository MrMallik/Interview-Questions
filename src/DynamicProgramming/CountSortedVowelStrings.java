package DynamicProgramming;

public class CountSortedVowelStrings {

    public static int countVowelStrings(int n) {
        int dp[][] =new int[5][n];
        for(int i=0;i<5;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j]=1;
                }
                else if(j==0){
                    dp[i][j]=i+1;
                }
                else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < n; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[4][n-1];
    }

    public static void main(String[] args) {
        System.out.println(countVowelStrings(2));
    }
}
