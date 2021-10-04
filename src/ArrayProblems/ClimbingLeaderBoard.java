package ArrayProblems;

import java.util.*;

public class ClimbingLeaderBoard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked,
                                                    List<Integer> player) {
        // Write your code here

        List<Integer> ansArr = new ArrayList<>();
        List<Integer> rankArr = new ArrayList<Integer>();
        rankArr.add(1);

        for(int i = 1; i < ranked.size(); i++){
            if(ranked.get(i-1) > ranked.get(i))
                rankArr.add(rankArr.get(i-1) + 1);
            else
                rankArr.add(rankArr.get(i-1));
        }

        for(int i = player.size() - 1; i >= 0; i--){
            int playerScore = player.get(i);
            int j = 0;

            while(j < ranked.size() && playerScore < ranked.get(j))
                j++;

            if(j != ranked.size())
                ansArr.add(0, rankArr.get(j));
            else
                ansArr.add(0, rankArr.get(rankArr.size() - 1) + 1);
        }

        return ansArr;
    }

    public static void main(String[] args) {
        List<Integer> ranked = Arrays.asList(100, 90, 90, 80, 75, 60);
        List<Integer> player = Arrays.asList(50, 65, 77, 90, 102);

        climbingLeaderboard(ranked, player).forEach(System.out::println);
    }

}
