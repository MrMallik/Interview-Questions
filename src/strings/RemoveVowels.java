package strings;

public class RemoveVowels {
    public static String removeVowels(String s){
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) == 'A' || sb.charAt(i) == 'a' ||
               sb.charAt(i) == 'E' || sb.charAt(i) == 'e' ||
               sb.charAt(i) == 'I' || sb.charAt(i) == 'i' ||
               sb.charAt(i) == 'O' || sb.charAt(i) == 'o' ||
               sb.charAt(i) == 'U' || sb.charAt(i) == 'u'){
                sb.setCharAt(i, '\u0000');
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeVowels("AeE"));
    }
}
