
public class RotateMatrix {
    public static void rotate90(int arr[][]){
        int[][] res = new int[3][3];
        int i,j,k = 2;

        for(i = 0; i < 3; i++, k--){
            for(j = 0; j < 3; j++){
                res[j][k] = arr[i][j];
            }
        }

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        rotate90(arr);
    }

}
