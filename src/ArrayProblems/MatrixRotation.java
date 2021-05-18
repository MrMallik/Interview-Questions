package ArrayProblems;


/**
 * This code works but will take O(N*M) extra space
 */

public class MatrixRotation {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9},
                {1,1,1}};

        int i,j, row = 4, col = 3;

        int[][] arr_tranpose = new int[col][row];

        //Transpose the matrix first

        for(i = 0; i < row; i++)
            for(j = 0; j < col; j++)
                arr_tranpose[j][i] = arr[i][j];

        //Reverse the elements row-wise

        for(i = 0; i < col; i++){ //in the transpose col become the row
            int start = 0;
            int end = row - 1; //and row become the col

            while(start < end){
                int temp = arr_tranpose[i][start];
                arr_tranpose[i][start] = arr_tranpose[i][end];
                arr_tranpose[i][end] = temp;

                start++;
                end--;
            }
        }





        for(i = 0; i < col; i++){
            for(j = 0; j < row; j++)
                System.out.print(arr_tranpose[i][j] + " ");
            System.out.println();
        }
    }
}
