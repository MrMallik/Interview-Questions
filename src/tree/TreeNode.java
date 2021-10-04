package tree;

public class TreeNode<T> {

    TreeNode left;
    TreeNode right;
    T val;
    boolean visited;

    public TreeNode(T val) {
        this.val = val;
    }

    public TreeNode(TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }

    public TreeNode(TreeNode left, TreeNode right, T val) {
        this.left = left;
        this.right = right;
        this.val = val;
    }
}
