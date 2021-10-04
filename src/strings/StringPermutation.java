package strings;

import java.util.*;

/**
 * String Permutation with Duplicates
 * Code Stolen from Cracking the Coding Interview
 */

public class StringPermutation {

    public String insertCharAt(String word, char ch, int idx){
        String start = word.substring(0, idx);
        String end = word.substring(idx);

        return start + ch + end;
    }

    public ArrayList<String> permute(String str){
        if(str == null) return null;

        ArrayList<String> permutations = new ArrayList<>();
        if(str.length() == 0){
            permutations.add("");
            return permutations;
        }

        char first = str.charAt(0);
        String remainder = str.substring(1);
        ArrayList<String> words = permute(remainder);

        for(String word : words){
            for(int j = 0; j <= word.length(); j++){
                String s = insertCharAt(word, first ,j);
                permutations.add(s);
            }
        }

        return permutations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to print permutations : ");
        String str = sc.nextLine();

        ArrayList<String> permutations = new ArrayList<>();

        permutations = new StringPermutation().permute(str);

        System.out.println(permutations);

    }
}
