package DynamicProgramming;

public class CanSum {

    //Finite coin variant
    static boolean canSum(int num, int[] arr, int start){
        if(num == 0) return true;
        if(num < 0 || start == arr.length) return false;

        int i;
        boolean ans = false;
        for(i = start; i < arr.length; i++)
            ans = canSum(num - arr[i], arr, start + 1);

        return ans;
    }

    //Infinite coin variant
    static boolean canSum(int num, int[] arr){
        if(num == 0) return true;
        if(num < 0) return false;

        int i;
        boolean ans = false;
        for(i = 0; i < arr.length; i++)
            ans = canSum(num - arr[i], arr);

        return ans;
    }

    public static void main(String[] args) {
        int num = 4;
        int[] arr = {2};
        System.out.println("Infinite Variant : " + canSum(num, arr));
        System.out.println("Finite Variant : " + canSum(num, arr, 0));
    }
}
