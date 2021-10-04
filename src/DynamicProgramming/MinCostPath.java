package DynamicProgramming;

public class MinCostPath {

    public static void main(String[] args) {
        int[][] sm = {{1, 2, 3},
                      {5,4,2},
                      {7,2,5}};

        int[][] rm = new int[3][3];
        int i, j;

        rm[0][0] = sm[0][0]; //copy source

        /*//initialize 1st row
        for(i = 1; i < 3; i++)
            rm[0][i] = rm[0][i-1] + sm[0][i];

        //initialize 2nd row
        for(i = 1; i < 3; i++)
            rm[i][0] = rm[i-1][0] + sm[i][0];*/

        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){

                if(j == 0)
                    rm[0][i] = rm[0][i-1] + sm[0][i];
                else if(i == 0)
                    rm[i][0] = rm[i-1][0] + sm[i][0];
                else
                    rm[i][j] = Math.min(Math.min(rm[i-1][j], rm[i][j-1]),
                            rm[i-1][j-1]) + sm[i][j];
            }
        }

        System.out.println(rm[2][2]);
        }
    }

