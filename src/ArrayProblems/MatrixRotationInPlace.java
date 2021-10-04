package ArrayProblems;

public class MatrixRotationInPlace {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9}};

        int i,j, N = 3;


        int temp;

//        temp = arr[top][left];
//        arr[top][left] = arr[bottom][left];
//        arr[bottom][left] = arr[bottom][right];
//        arr[bottom][right] = arr[top][right];
//        arr[top][right] = temp;

        for(int layers = 0; layers < N/2; layers++){
            int first = layers;
            int last = N - 1 - layers;

            for(i = first; i < last; i++){
                int offset = i - first;

                int top = arr[first][i];

                //left -> top
                arr[first][i] = arr[last-offset][first];

                //bottom -> left
                arr[last - offset][first] = arr[last][last-offset];

                //right -> bottom
                arr[last][last-offset] = arr[i][last];

                //top -> right
                arr[i][top] = top;
            }
        }

        for(i = 0; i < N; i++){
            for(j = 0; j < N; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
