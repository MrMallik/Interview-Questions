package DynamicProgramming;

/**
 * Find minimum operations needed to reach N starting from 0
 * Operations allowed : +1 and x2 only i.e - add one, and double no
 */

public class MinOperations {
    /*static int minOp(int num, int target){
        if(num == target) return 1;
        if(num > target) return 0;
        System.out.println("num : " + num + ", target : " + target);
        return 1 + Math.min(1 + minOp(num +1, target), 1 + minOp(num * 2, target));
    }*/

    static int minOp(int num){
        if(num <= 3) return num;
        if(num % 2 == 0) return 1 + minOp(num / 2);
        else return 2 + minOp(num / 2);
    }

    public static void main(String[] args) {
        System.out.println(minOp(7));
    }
}
