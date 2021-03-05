package ArrayProblems;

/**
 * Given an array, form the largest number possible by arranging the array elements
 */

import java.util.ArrayList;

public class FormingLargestNumber {

    public static boolean isBetter(String X, String Y){
        String XY = X + Y;
        String YX = Y + X;

        return XY.compareTo(YX) > 0;
    }

    public static String maxNumber(ArrayList<String> numbers){

        String max = "0";
        String ans = "";

        while(!numbers.isEmpty()){
            for(String num : numbers){
                if(isBetter(num, max))
                    max = num;
            }
            ans+=max;
            numbers.remove(max);
            max = "0";
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();

        numbers.add("3");
        numbers.add("30");
        numbers.add("34");
        numbers.add("5");
        numbers.add("9");

        System.out.println(maxNumber(numbers));
    }
}
