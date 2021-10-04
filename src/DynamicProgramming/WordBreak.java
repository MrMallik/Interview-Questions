package DynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];

        dp[n] = true;

        for(int i = n - 1; i >= 0; i--){
            for(String w : wordDict){
                if(i + w.length() <= n && s.substring(i, i + w.length()).equals(w))
                    dp[i] = dp[i + w.length()];
                if(dp[i])
                    break;
            }
        }

        return dp[0];
    }

    public static void main(String[] args) {
        //System.out.println(wordBreak("leetcode", Arrays.asList("leet", "code")));
        /*System.out.println(wordBreak("catsandog",
                Arrays.asList("cats", "dog", "sand", "and", "cat")));*/

        System.out.println(wordBreak("leetcode", Arrays.asList("neet", "code")));
    }

}
