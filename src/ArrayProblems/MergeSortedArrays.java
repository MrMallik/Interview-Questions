package ArrayProblems;

public class MergeSortedArrays {
    public static void merge(int[] M, int[] N){
        int len = M.length + N.length;
        int[] arr = new int[len];
        int i,j = 0,k = 0;

        for(i = 0; i < len; i++){
            if(j != M.length && k != N.length){
                if(M[j] < N[k])
                    arr[i] = M[j++];
                else
                    arr[i] = N[k++];
            }
            else if(j==M.length){
                while(k != N.length)
                    arr[i++] = N[k++];
            }
            else{
                while(j != M.length)
                    arr[i++] = M[j++];
            }
        }

        for(int p : arr)
            System.out.print(p + " ");
    }

    public static void main(String[] args) {
        int[] M = {27, 38};
        int[] N = {3, 43};
        merge(M, N);
    }
}
