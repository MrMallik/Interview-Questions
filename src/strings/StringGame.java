package strings;

public class StringGame {

    public static boolean shift(String S, String T, int k){
        for(int i = 0; i < S.length(); i++){
            char ch1 = S.charAt(i);
            char ch2 = T.charAt(i);
            int offset = ch2 - ch1;

            if(offset > k)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String S = "you", T = "ape";
        int k = 10;

        if(shift(S, T, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
