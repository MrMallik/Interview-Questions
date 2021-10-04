package DynamicProgramming;


import java.util.Arrays;

public class CommonElementsInArrays {

    /**
     * This problem is basically about finding the LCS of the two arrays
     *
     * @param first
     * @param second
     * @return
     */

    public static int[] f(int[] first, int[] second) {

        if (first == null || second == null)
            return null;

        Arrays.sort(first);
        Arrays.sort(second);
        int m = first.length;
        int n = second.length;
        int[][] cache = new int[m + 1][n + 1];
        int i, j;

        for (i = 0; i <= m; i++) {
            for (j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    cache[i][j] = 0;

                else if (first[i - 1] == second[j - 1])
                    cache[i][j] = 1 + cache[i - 1][j - 1];
                else
                    cache[i][j] = Math.max(cache[i][j - 1], cache[i - 1][j]);
            }
        }

        int index = cache[m][n];
        int[] commonElements = new int[index];

        while (m > 0 && n > 0) {

            if (first[m - 1] == second[n - 1]) {
                commonElements[index - 1] = first[m - 1];

                m--;
                n--;
                index--;
            } else if (cache[m - 1][n] > cache[m][n - 1])
                m--;
            else
                n--;
        }

        /*if(first[0] == second[0])
            commonElements[0] = first[0];*/

        return commonElements;
    }

    public static void main(String[] args) {
        int[][] first = {{1,8,3,2}, {1,8,3,2,6}, {1,3,7,9}, {1,2},{},
                {1,2}, {1,2}, null, null};
        int[][] second = {{4,2,6,1}, {2,6,1}, {7,1,9,3}, {3,4}, {1,2,3},{}, null,
                {}, null};


        for(int i = 0; i < first.length; i++)
            System.out.println(Arrays.toString(f(first[i], second[i])));

    }
}
