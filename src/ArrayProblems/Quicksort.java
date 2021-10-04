package ArrayProblems;

import java.util.Arrays;

public class Quicksort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void Quicksort(int[] arr, int lo, int hi){
        if(lo < hi){
            int pivot = partition(arr, lo, hi);
            Quicksort(arr, lo, pivot - 1);
            Quicksort(arr, pivot + 1, hi);
        }
    }

    public static int partition(int[] arr, int lo, int hi){
        int pivotVal = arr[hi];
        int i = lo - 1;

        for(int j = lo; j < hi; j++){
            if(arr[j] <= pivotVal){
                i++;
                swap(arr, i, j);
            }
        }
        
        swap(arr, i+1, hi);

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        int lo = 0;
        int hi = arr.length - 1;

        System.out.println("Before Sorting : " + Arrays.toString(arr));
        Quicksort(arr, lo, hi);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }
}
