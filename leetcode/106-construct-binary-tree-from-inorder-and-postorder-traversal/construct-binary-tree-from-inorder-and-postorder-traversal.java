class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(postorder, map, postorder.length - 1, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, Map<Integer, Integer> map,
                           int postIndex, int inLeft, int inRight) {

        if (inLeft > inRight || postIndex < 0)
            return null;

        int rootVal = postorder[postIndex];
        TreeNode root = new TreeNode(rootVal);

        int mid = map.get(rootVal);

        // Number of nodes in right subtree
        int rightSize = inRight - mid;

        // Build right subtree first
        root.right = build(postorder, map,
                           postIndex - 1,
                           mid + 1,
                           inRight);

        // Build left subtree
        root.left = build(postorder, map,
                          postIndex - rightSize - 1,
                          inLeft,
                          mid - 1);

        return root;
    }
}