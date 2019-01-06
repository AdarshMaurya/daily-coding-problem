package com.softhinkers.test;

import com.softhinkers.solutions.Solution3;

public class TestSolution3 {

    public static void main(String[] args) {

        Solution3.BinaryTree tree = new Solution3.BinaryTree();
        tree.root = new Solution3.Node("root");
        tree.root.left = new Solution3.Node("left");
        tree.root.right = new Solution3.Node("right");
        tree.root.left.left = new Solution3.Node("left-left");
        tree.root.left.right = new Solution3.Node("left-right");

        testSolution1(tree.root);
    }

    private static void testSolution1(Solution3.Node root) {
        Solution3 sol3 = new Solution3();

        String serialized = sol3.serializeStringToBinaryTreePreOrder(root);
        System.out.println(serialized);

        Solution3.Node node = sol3.deserializeBinaryTreePreOrder(serialized);
        if ("left-left".equals(node.left.left.val)) {
            System.out.println("deserialize pass");
        } else {
            System.out.println("deserialize fail");

        }
    }
}
