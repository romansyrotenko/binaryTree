public class BinaryTree {

    private TreeNode node;
    private String outputBinaryTreeString = "";

    public void add(int x) {

        if (node == null) {
            node = new TreeNode(x);
            return;
        }

        TreeNode tempNode = node;

        while (true) {

            if (x < tempNode.key) {
                if (tempNode.left == null) {
                    tempNode.left = new TreeNode(x);
                    return;
                } else {
                    tempNode = tempNode.left;
                }
            } else if (x > tempNode.key) {
                if (tempNode.right == null) {
                    tempNode.right = new TreeNode(x);
                    return;
                } else {
                    tempNode = tempNode.right;
                }
            } else {
                return;
            }
        }
    }

    public String printNode(TreeNode node) {

        String output = "Node key: " + node.key + ",";

        if (node.left == null) {
            output = output + " left node: null,";
        } else {
            output = output + " left node: " + node.left.key + ",";
        }

        if (node.right == null) {
            output = output + " right node: null\n";
        } else {
            output = output + " right node: " + node.right.key + "\n";
        }

        return output;

    }

     public void printAllNodes(TreeNode node) {

        if (node.left != null) {
            printAllNodes(node.left);
        }
        if (node.right != null) {
            printAllNodes(node.right);
        }
        outputBinaryTreeString = printNode(node) + outputBinaryTreeString;

    }

    @Override
    public String toString() {
        printAllNodes(node);
        return "Current BinaryTree:\n" + outputBinaryTreeString;
    }
}
