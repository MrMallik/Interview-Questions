package strings;

public class LongestSubstringWithRepeatingCharacters {

    public static void longestSubstr(String s, int k){
        char c;
        int i, kCopy = k, maxLength = 0;

        for(c = 'A'; c <= 'Z'; c++){
            i = 0;
            k = kCopy;
            StringBuilder sCopy = new StringBuilder(s);
            while(k > 0 && i < sCopy.length()){
                if(sCopy.charAt(i) != c) {
                    sCopy.setCharAt(i, c);
                    k--;
                }
                i++;
            }

            //System.out.println(sCopy);

            int longestSoFar = 1;

            for(i = 0; i < sCopy.length() - 1; i++) {
                if(sCopy.charAt(i) != sCopy.charAt(i + 1)){
                  longestSoFar = Math.max(longestSoFar, i);
                }
            }

            maxLength = Math.max(longestSoFar+1, maxLength);
        }

        System.out.println(maxLength);
    }

    public static void main(String[] args) {
        String s = "ABAA";
        int k = 0;

        longestSubstr(s, k);
    }

}
