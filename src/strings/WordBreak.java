package strings;

import java.util.*;

public class WordBreak {

    public static boolean wordBreakCheck(String s, List<String> wordDict){
        int i, j;
        String temp="", extrctString;



        for(i = 0; i < s.length(); i++){
            for(j = i; j < s.length(); j++){
                extrctString = s.substring(i, j+1);
                if(wordDict.contains(extrctString))
                    temp += extrctString;
            }
        }

        return temp.equals(s);
    }

    public static void main(String[] args) {

        //List<String> wordDict = Arrays.asList("cats", "dogs", "and");
        //String s = "catsandogs";

        List<String> wordDict = Arrays.asList("a", "ab");
        String s = "aab";

        //List<String> wordDict = Arrays.asList("a", "abc", "b", "cd");
        //String s = "abcd";

        System.out.println(wordBreakCheck(s, wordDict));
    }
}
