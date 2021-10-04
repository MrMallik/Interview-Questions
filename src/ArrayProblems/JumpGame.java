package ArrayProblems;

import java.util.*;

public class JumpGame {
    public static boolean canJump(int[] arr, int idx, int target) {
        if (idx == target)
            return true;

        boolean status = false;
        for (int i = 1; i <= arr[idx]; i++)
            status = status || canJump(arr, idx + i, target);


        return status;
    }

    public static boolean canJumpMemo(int[] arr, int idx, int target,
                                      HashMap<Integer, Boolean> memo)   {
        if(idx == target)
            return true;

        boolean status = false;

        for(int i = 1; i <= arr[idx]; i++){
            if(!memo.containsKey(arr[idx]))
                memo.put(arr[idx], canJumpMemo(arr, idx + 1, target, memo));

            status = status || memo.get(arr[idx]);
        }

        return status;
    }

    public static void main(String[] args) {
        //int arr[] = {2,3,1,1,4};
        int[] arr = {3,2,1,0,4};
        //int arr[] = {3, 1, 1, 1};
        int target = arr.length - 1;
        int idx = 0;
        //System.out.println(canJump(arr, idx, target));
        System.out.println(canJumpMemo(arr, idx, target, new HashMap<Integer, Boolean>()));
    }
}
