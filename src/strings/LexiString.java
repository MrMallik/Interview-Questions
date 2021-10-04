package strings;

public class LexiString {

    public static String lexiStr(String P, String S){

        String ans = "";

        for(int i = 0; i < P.length(); i++){
            char ch1 = P.charAt(i);
            for(int j = 0; j < S.length(); j++){
                char ch2 = S.charAt(j);
                if(ch1 == ch2){
                    ans = ans + ch1;
                    break;
                }
            }
        }

        return ans;
    }

}
