package ArrayProblems;

import java.util.ArrayList;

public class GenerateSubsets {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int i, j, n = arr.length;

        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(i = 1; i < (1 << n); i++){
            for(j = 0; j < n; j++){
                if((i & (1 << j)) > 0)
                    temp.add(arr[j]);
            }
            System.out.println(temp);
            temp.clear();
        }
    }
}
