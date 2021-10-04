package strings;

import java.util.Scanner;

public class StringCompression {

    public static String compressStr(String str){
        //Input : bbbbddddaac
        //Output : b4d4a2c

        int i = 0, ctr;
        String res = "";

        str = str + " ";

        while(i < str.length() - 1){
            ctr = 1;
            while(i < str.length() && str.charAt(i) == str.charAt(i+1)){
                i++;
                ctr++;
            }
            if(ctr > 1){
                res = res + str.charAt(i) + ctr;
            }
            else
                res = res + str.charAt(i);

            i++;
        }

        return res;
    }

    public static void main(String args[]){
        String str;

        System.out.print("Enter string for compression : ");
        str = new Scanner(System.in).nextLine();

        System.out.println("Compressed String : " + compressStr(str));
    }
}
