package ArrayProblems;


/**
 * Given an array of distinct integers.
 * The task is to count all the triplets such that sum of two elements equals the third element.
 * Input:
 * N = 4
 * arr[] = {1, 5, 3, 2}
 * Output: 2
 * Explanation: There are 2 triplets:
 * 1 + 2 = 3 and 3 +2 = 5
 *
 * https://practice.geeksforgeeks.org/problems/count-the-triplets4615/1
 */

import java.util.ArrayList;

public class CountTriplets {
    public static void genTriplets(ArrayList<Integer> list){
        int i, j, k;
        ArrayList<Integer> temp = new ArrayList<>();
        for(i = 0; i < list.size(); i++){
            for(j = 0; j < list.size(); j++){
                for(k = 0; k < list.size(); k++){
                    temp.add(list.get(i));
                    temp.add(list.get(j));
                    temp.add(list.get(k));
                }
            }
            System.out.println(temp);
            temp.clear();
        }
    }

    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        genTriplets(list);

    }
}
