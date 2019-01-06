package com.softhinkers.solutions;

import com.softhinkers.problems.Problem3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution3 implements Problem3 {


    @Override
    public String serializeStringToBinaryTreePreOrder(Node root) {
        return serialize(root);
    }

    @Override
    public Node deserializeBinaryTreePreOrder(String inOrderBinaryTreeString) {
        return deserialize(inOrderBinaryTreeString);
    }

    private static String serialize(Node node) {
        StringBuilder serializedNode = new StringBuilder();
        serializeNodes(node, serializedNode);
        return serializedNode.toString();
    }

    private static void serializeNodes(Node node, StringBuilder stringBuilder) {
        if (node == null) {
            stringBuilder.append("#").append(" ");
        } else {
            stringBuilder.append(node.getVal()).append(" ");
            serializeNodes(node.getLeft(), stringBuilder);
            serializeNodes(node.getRight(), stringBuilder);
        }
    }

    private static Node deserialize(String serializedNode) {
        List<String> nodes = new ArrayList<String>();
        nodes.addAll(Arrays.asList(serializedNode.split(" ")));
        return deserializeArray(nodes);
    }

    private static Node deserializeArray(List<String> nodes) {
        String temp = nodes.remove(0);

        if (temp.equals("#")) {
            return null;
        }
        Node node = new NodeBuilder().setVal(temp).build();
        node.setLeft(deserializeArray(nodes));
        node.setRight(deserializeArray(nodes));

        return node;
    }

    public static class Node {
        public String val;
        public Node left;
        public Node right;

        public Node(String item) {
            val = item;
            left = right = null;
        }

        public Node() {
        }

        public String getVal() {
            return val;
        }

        public void setVal(String val) {
            this.val = val;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public static class BinaryTree {
        // Root of BinaryTree
        public Node root;

        public BinaryTree() {
            root = null;
        }

        // Depth First Traversal
        // 1. InOrder(Left, Root, Right)
        // 2. PreOrder(Root, Left, Right)
        // 3. Post(Left, Right, Root)

        /**
         * Algorithm InOrder(tree)
         * 1. Traverse the left subtree i.e call InOrder(left-subtree)
         * 2. Visit the root.
         * 3. Traverse the right subtree i.e call InOrder(right-subtree)
         * <p>
         * In case of binary search trees (BST), InOrder nodes gives nodes in non-decreasing order
         * To get nodes of BST in non-decreasing order, a variation of In-Order traversal where In-Order traversal is reversed.
         * </p>
         *
         * @param node
         */
        void printInOrder(Node node) {

            if (node == null) return;

            // first recur on the left child
            printInOrder(node.left);

            // then print the data of the node
            System.out.print(node.val + " ");

            // now recur on the right child
            printInOrder(node.right);
        }

        /**
         * Algorithm PreOrder(tree)
         * 1. Visit the root.
         * 2. Traverse the left subtree i.e call PreOrder(left-subtree)
         * 3. Traverse the right subtree i.e call PreOrder(right-subtree)
         * <p>
         * Pre-Order traversal is used to create a copy of tree.
         * Pre-Order traversal is also used to get pre-fix expression on of an expression tree.
         * </p>
         *
         * @param node
         */
        void printPreOrder(Node node) {

            if (node == null) return;

            // first print the data of node
            System.out.print(node.val + " ");

            // then recur on left subtree
            printPreOrder(node.left);

            // now recur on right subtree
            printPreOrder(node.right);


        }

        /**
         * Algorithm PostOrder(tree)
         * 1. Traverse the left subtree i.e call PostOrder(left-subtree)
         * 2. Traverse the right subtree i.e call PostOrder(right-subtree)
         * 3. Visit the root
         * <p>
         * PostOrder traversal is used to delete the tree.
         * PostOrder traversal is useful to get the postfix expression of expression tree.
         *
         * @param node
         */
        void printPostOrder(Node node) {

            if (node == null) return;

            // first recur on the left subtree
            printPostOrder(node.left);

            //then recur on the right subtree
            printPostOrder(node.right);

            // now print the key
            System.out.print(node.val + " ");
        }

        // Wrappers over recursive functions
        public void printInOrder() {
            printInOrder(root);
        }

        public void printPreOrder() {
            printPreOrder(root);
        }

        public void printPostOrder() {
            printPostOrder(root);
        }
    }

    public static class NodeBuilder {

        private Node node;

        public NodeBuilder() {
            this.node = new Node();
        }

        public Node build() {
            return node;
        }

        public NodeBuilder setVal(String val) {
            this.node.setVal(val);
            return this;
        }

        public NodeBuilder setLeft(Node left) {
            this.node.setLeft(left);
            return this;
        }

        public NodeBuilder setRight(Node right) {
            this.node.setRight(right);
            return this;
        }
    }


    public String serializeStringToBinaryTreePreOrder2(Node root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(serializeStringToBinaryTreePreOrder(root.right));
        sb.append(serializeStringToBinaryTreePreOrder(root.left));
        sb.append(root.val);
        sb.append(",");
        return sb.toString();
    }

    public String serializeStringToBinaryTreeInOrder(Node root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append(",");
        sb.append(serializeStringToBinaryTreeInOrder(root.left));
        sb.append(serializeStringToBinaryTreeInOrder(root.right));
        return sb.toString();
    }

    public String serializeStringToBinaryTreePostOrder(Node root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        sb.append(serializeStringToBinaryTreeInOrder(root.left));
        sb.append(root.val);
        sb.append(",");
        sb.append(serializeStringToBinaryTreeInOrder(root.right));
        return sb.toString();
    }




}
