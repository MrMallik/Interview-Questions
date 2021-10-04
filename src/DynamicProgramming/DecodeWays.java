package DynamicProgramming;

public class DecodeWays {

    /**
     * Wrong code, LOL!!!
     * @param args
     */

    /*public static int decodingWays(String s, int splitPtr){
        if(splitPtr <= s.length()){

            String splitStr = s.substring(0, splitPtr);

            if(Integer.valueOf(splitStr) >= 1 && Integer.valueOf(splitStr) <= 26)

            if(splitPtr == s.length())
                return 1;

            return decodingWays(s, splitPtr + 1) +
                    decodingWays(s, splitPtr + 2);
        }
        else
            return 0;
    }*/

    public static int decodingWays(String s, int splitPtr){
        if(splitPtr == s.length())
            return 1;
        if(s.charAt(splitPtr) == '0')
            return 0;
        int res = decodingWays(s, splitPtr + 1);

        if(splitPtr < s.length() - 1 && (s.charAt(splitPtr) == '1' ||
                s.charAt(splitPtr) == '2') && s.charAt(splitPtr + 1) < '7')
            res += decodingWays(s, splitPtr + 2);

        return res;
    }

    public static void main(String[] args) {
        System.out.println(decodingWays("12", 0));
    }

}
