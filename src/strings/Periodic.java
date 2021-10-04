package strings;

import java.util.Scanner;

public class Periodic {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long num=s.nextLong();
        int n=Integer.MAX_VALUE,i=0;
        int arr[]=new int[n];
        int k=0,count=0;
        while(i<n){
            int sum=0,c=0;
            long nu=num;
            String str="";
            while(num>0){
                sum+=num%10;
                num=num/10;
            }
            int l=String.valueOf(sum).length();
            str+=nu+sum;
            int g=(int)(Integer.valueOf(str)%Math.pow(10,str.length()-l));
            arr[k]=g;
            k++;
            num=g;
            for(int j=0;j<k;j++){
                if(arr[j]==sum)
                    c++;
            }
            if(c==0)
                i++;
            else
                count=i;
            break;
        }
        System.out.println(count);
    }

}
