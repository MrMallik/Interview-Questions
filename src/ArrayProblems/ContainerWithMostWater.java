package ArrayProblems;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static int maxArea(ArrayList<Integer> heights){
        int left = 0, right = heights.size();
        int maxWater = 0 , water = 0;

        while(left < right){
            water = (right - left) * Math.min(heights.get(left), heights.get(right));

            if(water > maxWater)
                maxWater = water;

            if(heights.get(left) < heights.get(right))
                left++;
            else
                right--;
        }
        return maxWater;
    }
}
