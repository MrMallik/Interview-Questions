package ArrayProblems;

public class ArraySpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                        {9, 10, 11 , 12}};
        int n = arr.length;
        int top = 0, bottom = 3, left = 0, right = 4, i;

        //bottom : no of rows
        //right : no of columns

        while(top < bottom && left < right){
            //print the first row
            for(i = left; i < right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            //print the last column
            for(i = top; i < bottom; i++)
                System.out.print(arr[i][right - 1] + " ");
            right--;

            //if (top < bottom) {
                //print the last row
                for(i = right - 1; i >= left; i--)
                    System.out.print(arr[bottom - 1][i] + " ");
                bottom--;
            //}

            //if (left < right) {
                //print the first column
                for(i = bottom - 1; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            //}
        }
    }
}
