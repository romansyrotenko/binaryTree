package BinaryTreeRepository;

public class BinaryTree {

    private TreeNode node;
    private String outputBinaryTreeString = "";

    public TreeNode getNode() {
        return node;
    }

    public void add(int x) {

        if (node == null) {
            node = new TreeNode(x);
            System.out.println("Node was succesfully added!");
            return;
        }

        TreeNode tempNode = node;

        while (true) {

            if (x < tempNode.key) {
                if (tempNode.left == null) {
                    tempNode.left = new TreeNode(x);
                    System.out.println("Node was succesfully added!");
                    return;
                } else {
                    tempNode = tempNode.left;
                }
            } else if (x > tempNode.key) {
                if (tempNode.right == null) {
                    tempNode.right = new TreeNode(x);
                    System.out.println("Node was succesfully added!");
                    return;
                } else {
                    tempNode = tempNode.right;
                }
            } else {
                System.out.println("Node already exists! Nothing to add!");
                return;
            }
        }
    }

    private String printNode(TreeNode node) {

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

     private void printAllNodes(TreeNode node) {

        if (node.right != null) {
            printAllNodes(node.right);
        }

        if (node.left != null) {
            printAllNodes(node.left);
        }

        outputBinaryTreeString = printNode(node) + outputBinaryTreeString;
    }

    @Override
    public String toString() {

        outputBinaryTreeString = "";
        if(node != null) {
            printAllNodes(node);
            return "Current BinaryTree:\n" + outputBinaryTreeString;
        } else {
            return "oops.... BinaryTree is empty... nothing to print!";
        }
    }
}
