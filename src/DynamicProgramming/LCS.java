package DynamicProgramming;

public class LCS {

    public static int longestCommonSubsequence(String text1, String text2) {
        int i, j, m = text1.length(), n = text2.length();
        int[][] cache = new int[m + 1][n + 1];

        for(i = 0; i <= m; i++){
            for(j = 0; j <= n; j++){

                if(i == 0 || j == 0)
                    cache[i][j] = 0;

                else if(text1.charAt(i - 1) == text2.charAt(j - 1))
                    cache[i][j] = 1 + cache[i - 1][j - 1];
                else
                    cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
            }
        }

        return cache[m][n];

    }

    public static void lcsPrint(String text1, String text2){
        int i, j, m = text1.length(), n = text2.length();
        int[][] cache = new int[m + 1][n + 1];

        for(i = 0; i <= m; i++){
            for(j = 0; j <= n; j++){

                if(i == 0 || j == 0)
                    cache[i][j] = 0;

                else if(text1.charAt(i - 1) == text2.charAt(j - 1))
                    cache[i][j] = 1 + cache[i - 1][j - 1];
                else
                    cache[i][j] = Math.max(cache[i-1][j], cache[i][j-1]);
            }
        }

        String lcs = "";

        while(m > 0 && n > 0){
            if(text1.charAt(m-1) == text2.charAt(n-1)){

                lcs = text1.charAt(m-1) + lcs;

                m--;
                n--;
            }

            else if(cache[m-1][n] > cache[m][n-1])
                m--;
            else
                n--;
        }

        System.out.println(lcs);

    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abc", "ab"));
        //lcsPrint("18326", "261");
    }

}
