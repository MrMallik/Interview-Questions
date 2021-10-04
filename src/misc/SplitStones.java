package misc;

import java.util.*;

//Problem Link : https://www.codechef.com/problems/SPLST

public class SplitStones {

    public static String SplitStonesUtil(int a, int b, int c, int x, int y){
        //Now our objective is to reach x from a and y to b
        //using the stones in c
        //We shall return true only if src <= dest otherwise, its not possible
        if(a <= x  && a+b+c==x+y)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T-- > 0){
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();


            //Sort it, so that we shall always choose the
            // stack with the largest stones for distribution
            Arrays.sort(arr);

            if(x > y){
                int temp = x;
                x = y;
                y = temp;
            }

            System.out.println(SplitStonesUtil(arr[0], arr[1], arr[2], x, y));

        }
    }
}
