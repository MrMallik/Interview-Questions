package tree;

import java.util.Arrays;
import java.util.List;

public class TreeZigZagTraversal {

    //[[1],[2,3],[null, null, 4,5]]
    public static void traverse(List<List<TreeNode>> tree){
        boolean leftToRight = true;
        int level = 0;

        while(level < tree.size()){
            if(leftToRight){
                for(TreeNode i : tree.get(level))
                    if(i != null)
                        System.out.print(i.val + " ");
                leftToRight = false;
            }

            else{
                String ans="";
                for(TreeNode i : tree.get(level))
                    if(i != null)
                        ans = " " + i.val + ans;
                System.out.print(ans + " ");
                leftToRight = true;
            }
            level++;
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> node1 = new TreeNode<>(1);
        TreeNode<Integer> node2 = new TreeNode<>(2);
        TreeNode<Integer> node3 = new TreeNode<>(3);
        TreeNode<Integer> node4 = new TreeNode<>(4);
        TreeNode<Integer> node5 = new TreeNode<>(5);

        List<List<TreeNode>> tree = Arrays.asList(
          Arrays.asList(node1),
          Arrays.asList(node2, node3),
          Arrays.asList(node4, node5, null, null)
        );

        traverse(tree);
    }
}
