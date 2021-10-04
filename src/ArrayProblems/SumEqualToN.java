package ArrayProblems;

import java.util.ArrayList;

public class SumEqualToN {

    public static int sumArrayList(ArrayList<Integer> temp){
        int i, sum = 0;

        for(i = 0; i < temp.size(); i++)
            sum+= temp.get(i);

        return sum;
    }

    public static void main(String[] args) {
        //int arr[] = {1, 2, 3, 4, 5};
        int arr[] = {1, 5, 11, 5};
        int i, j, n = arr.length, K = 11;
        boolean flag = false;

        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(i = 0; i < (1 << n); i++){
            for(j = 0; j < n; j++){
                if((i & (1 << j)) > 0)
                    temp.add(arr[j]);
            }
            int sum = sumArrayList(temp);

            if(sum == K){
                flag = true;
                break;
            }
        }

        System.out.println(flag);
    }
}
