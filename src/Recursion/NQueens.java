package Recursion;

import java.util.ArrayList;

/**
 * Code stolen from Cracking the Coding Interview
 */

public class NQueens {
    static int GRID_SIZE = 8;

    void placeQueens(int row, Integer[] columns, ArrayList<Integer[]> results){
        if(row == GRID_SIZE)
            results.add(columns.clone());
        else{
            for(int col = 0; col < GRID_SIZE; col++){
                if(checkValid(columns, row, col)){
                    columns[row] = col;
                    placeQueens(row+ 1, columns, results);
                }
            }
        }
    }

    boolean checkValid(Integer[] columns, int row1, int column1){
        for(int row2 = 0; row2 < row1; row2++){
            int column2 = columns[row2];

            if(column1 == column2)
                return false;

            int columnDistance = Math.abs(column2 - column1);
            int rowDistance = row1 - row2;

            if(columnDistance == rowDistance)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer[]> ans = new ArrayList<>();

        new NQueens().placeQueens(0, new Integer[GRID_SIZE], ans);

        for(Integer[] i : ans) {
            System.out.print("{");
            for (Integer j : i)
                System.out.print(j + ",");
            System.out.println("\b}");
        }
    }
}
