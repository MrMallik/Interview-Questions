package strings;

public class BiggerIsBetter {
    public static String smallestStrGreaterThanThis(String str){

        StringBuilder s = new StringBuilder(str);

        int i = s.length() - 1;

        //Find pivot, i-1 is pivot
        while(i > 0 && s.charAt(i-1) >= s.charAt(i))
            i--;

        //Check if pivot exists
        if(i <= 0) return "no answer";

        //Find j, to swap pivot with
        int j = s.length() - 1;
        while(s.charAt(j) <= s.charAt(i-1) && j >= i)
            j--;

        //Swap elements at i-1 and j
        char temp = s.charAt(j);
        s.setCharAt(j, s.charAt(i-1));
        s.setCharAt(i-1, temp);

        //Reverse suffix starting from i
        s = new StringBuilder(s.substring(0,i)).append(new StringBuilder(s.substring(i)).reverse());

        return s.toString();
    }

    public static void main(String[] args) {
        String s = "db";

        System.out.println(smallestStrGreaterThanThis(s));
    }
}
