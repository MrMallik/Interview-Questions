package DynamicProgramming;

public class max1squares {

    public static int solve(int[][] binMat){
        int row = binMat.length;
        int col = binMat[0].length;
        int[][] solMat = new int[row][col];
        int maxSize = 0;

        /*for(int i = 0; i < n; i++){
            solMat[0][i] = binMat[0][i];
            solMat[i][0] = binMat[i][0];
        }*/

        for(int i = 0; i < row; i++)
            solMat[i][0] = binMat[i][0];

        for(int i = 0; i < col; i++)
            solMat[0][i] = binMat[0][i];

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                solMat[i][j] = Math.min(Math.min(solMat[i-1][j], solMat[i][j-1]),
                        solMat[i-1][j-1]) + binMat[i][j];
                maxSize = Math.max(maxSize, solMat[i][j]);
            }
        }

        return maxSize;
    }

    public static void main(String[] args) {
        //int[][] binMat = {{1,0,1,1,0}, {1,1,0,1,1},{1,1,1,0,1},{0,0,0,1,1}};
        //int[][] binMat = {{1,0,1,1}, {1,1,0,1},{1,1,1,0},{0,0,0,1}};
        int[][] binMat = {{1,1,1}, {1,1,1},{1,1,1}};


        System.out.println(solve(binMat));
    }

}
