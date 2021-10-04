package ArrayProblems;

import java.util.Arrays;

public class OneTwoOneArray {

    public static int is121Array(int[] a){
        int starting1s = 0, ending1s = 0, between2s = 0, i = 0;

        while(i < a.length && a[i] == 1) {
            starting1s++;
            i++;
        }

        i = a.length - 1;

        while(i >= 0 && a[i] == 1) {
            ending1s++;
            i--;
        }

        if(starting1s != ending1s || starting1s == 0)
            return 0;

        for(i = starting1s; i <= a.length - ending1s - 1; i++){
            if(a[i] != 2)
                return 0;
            else
                between2s++;
        }

        if(between2s > 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {

        int[][] arr = {{1,2,1}, {1,1,2,2,2,1,1}, {1,1,2,2,2,1,1,1},
                {1,1,2,1,2,1,1},{1,1,1,2,2,2,1,1,1,3},{1,1,1,1,1,1},
                {2,2,2,1,1,1,2,2,1,1},{1,1,1,2,2,2,1,1,2,2},{2,2,2}};


        for(int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]) + " : " + is121Array(arr[i]));
    }

}
