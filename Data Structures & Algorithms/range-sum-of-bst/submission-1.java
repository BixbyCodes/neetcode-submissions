class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (root.val >= low && root.val <= high) {
            sum += root.val;
        }

        int suml = helperleft(root.left, low, high);
        int sumr = helperright(root.right, low, high);

        return sum + suml + sumr;
    }

    public int helperleft(TreeNode left, int low, int high) {
        if (left == null) {
            return 0;
        }

        int l = 0;

        if (left.val >= low && left.val <= high) {
            l += left.val;
        }

        l += helperleft(left.left, low, high);
        l += helperleft(left.right, low, high);

        return l;
    }

    public int helperright(TreeNode right, int low, int high) {
        if (right == null) {
            return 0;
        }

        int r = 0;

        if (right.val >= low && right.val <= high) {
            r += right.val;
        }

        r += helperright(right.left, low, high);
        r += helperright(right.right, low, high);

        return r;
    }
}