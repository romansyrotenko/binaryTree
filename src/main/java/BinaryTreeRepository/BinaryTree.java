package BinaryTreeRepository;

import java.util.LinkedList;
import java.util.Queue;

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

    public void addGroupTestItems() {
        this.add(8);
        this.add(3);
        this.add(10);
        this.add(1);
        this.add(6);
        this.add(4);
        this.add(7);
        this.add(14);
        this.add(13);
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

    private void printAllNodesPreOrder(TreeNode node) {

        if (node != null) {
            printAllNodesPreOrder(node.right);
            printAllNodesPreOrder(node.left);
            outputBinaryTreeString = printNode(node) + outputBinaryTreeString;
        }
    }

    private void printAllNodesPostOrder(TreeNode node) {

        if (node != null) {
            outputBinaryTreeString = printNode(node) + outputBinaryTreeString;
            printAllNodesPostOrder(node.right);
            printAllNodesPostOrder(node.left);
        }
    }

    private void printAllNodesInOrder(TreeNode node) {

        if (node != null) {
            printAllNodesInOrder(node.right);
            outputBinaryTreeString = printNode(node) + outputBinaryTreeString;
            printAllNodesInOrder(node.left);
        }
    }

    private void printAllNodesAcross(TreeNode node) {

        Queue queue = new LinkedList<TreeNode>();
        TreeNode tempNode;

        queue.add(node);
        while (!queue.isEmpty()) {
            tempNode = (TreeNode)queue.poll();
            outputBinaryTreeString = outputBinaryTreeString + printNode(tempNode);
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    @Override
    public String toString() {

        outputBinaryTreeString = "";
        if(node != null) {
            printAllNodesPreOrder(node);
            return "Current BinaryTree:\n" + outputBinaryTreeString;
        } else {
            return "oops.... BinaryTree is empty... nothing to print!";
        }
    }

    public String toStringInOrder() {

        outputBinaryTreeString = "";
        if(node != null) {
            printAllNodesInOrder(node);
            return "Current BinaryTree:\n" + outputBinaryTreeString;
        } else {
            return "oops.... BinaryTree is empty... nothing to print!";
        }
    }

    public String toStringPostOrder() {

        outputBinaryTreeString = "";
        if(node != null) {
            printAllNodesPostOrder(node);
            return "Current BinaryTree:\n" + outputBinaryTreeString;
        } else {
            return "oops.... BinaryTree is empty... nothing to print!";
        }

    }

    public String toStringAcross() {

        outputBinaryTreeString = "";
        if(node != null) {
            printAllNodesAcross(node);
            return "Current BinaryTree:\n" + outputBinaryTreeString;
        } else {
            return "oops.... BinaryTree is empty... nothing to print!";
        }
    }

}
