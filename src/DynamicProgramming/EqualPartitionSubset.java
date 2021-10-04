package DynamicProgramming;

public class EqualPartitionSubset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int sum = 0;

        for(int e : arr)
            sum+=e;

        System.out.println(SubsetSum.isSubsetSumDP(arr, sum / 2));
    }
}
