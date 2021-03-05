package DynamicProgramming;

public class EditDistance {
    static String howTo = "";

    static int min(int x, int y, int z)
    {
        if (x <= y && x <= z) {
            howTo += "Insert\n";
            return x;
        }
        if (y <= x && y <= z) {
            howTo += "Remove\n";
            return y;
        }
        else {
            howTo += "Replace\n";
            return z;
        }
    }

    /**
     * Method to return the minimum operations to change str1 to str2
     * @param str1
     * @param str2
     * @param idx1
     * @param idx2
     * @return
     */
    public static int calcDistance(String str1, String str2, int idx1, int idx2){
        if(idx1 == 0)
            return idx2;
        if(idx2 == 0)
            return idx1;

        if(str1.charAt(idx1 - 1) == str2.charAt(idx2 - 1))
            return calcDistance(str1, str2, idx1 - 1, idx2 - 1);

        return 1 + Math.min(calcDistance(str1, str2, idx1, idx2 - 1),
                Math.min(calcDistance(str1, str2, idx1 - 1, idx2),
                        calcDistance(str1, str2, idx1 - 1, idx2-1)));
    }


    /**
     *
     * @param str1
     * @param str2
     * @param idx1 : pointer for str1
     * @param idx2 : pointer for str2
     * @return
     */
    public static int calcDistanceDP(String str1, String str2, int idx1, int idx2){
        // Create a table to store results of subproblems
        int dp[][] = new int[idx1 + 1][idx2 + 1];

        // Fill d[][] in bottom up manner
        for (int i = 0; i <= idx1; i++) {
            for (int j = 0; j <= idx2; j++) {
                // If first string is empty, only option is
                // to insert all characters of second string
                if (i == 0)
                    dp[i][j] = j; // Min. operations = j

                    // If second string is empty, only option is
                    // to remove all characters of second string
                else if (j == 0)
                    dp[i][j] = i; // Min. operations = i

                    // If last characters are same, ignore last
                    // char and recur for remaining string
                else if (str1.charAt(i - 1)
                        == str2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];

                    // If the last character is different,
                    // consider all possibilities and find the
                    // minimum
                else
                    dp[i][j] = 1 + min(dp[i][j - 1], dp[i - 1][j], dp[i - 1][j - 1]);
            }
        }

        return dp[idx1][idx2];
    }

    public static void main(String[] args) {
        String str1 = "bra"; //string to be changed
        String str2 = "birendra";

        System.out.println("Edit Distance : " + calcDistanceDP(str1, str2, str1.length(), str2.length()));
        System.out.println(howTo);
    }

}
