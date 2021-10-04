package ArrayProblems;

import java.util.Arrays;
public class Mergesort {

    public static void mergesort(int[] arr, int lo, int hi){
        if(lo < hi){
            int mid = lo + (hi-lo) / 2;
            mergesort(arr, lo, mid);
            mergesort(arr, mid+1, hi);

            merge(arr, lo, mid, hi);
        }
    }

    public static void merge(int[] arr, int lo, int mid, int hi){

        int len1 = mid - lo + 1, len2 = hi - mid;
        int[] L = new int[len1];
        int[] R = new int[len2];
        int i, j, k = lo;

        for(i = 0; i < len1; i++)
            L[i] = arr[lo + i];

        for(j = 0; j < len2; j++)
            R[j] = arr[mid + 1 + j];

        i = 0;
        j = 0;

        while(i < len1 && j < len2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < len1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < len2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] A = {5,2,6,7,8};

        System.out.println("Before Sorting : " + Arrays.toString(A));
        mergesort(A, 0, A.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(A));

    }
}
