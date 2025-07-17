package com.adhoc.progpractice.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class TraverseInOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inOrder(root);
    }

    private static void inOrder(Node node) {
        List<Integer> arr = new ArrayList<>();

        inOrder(node, arr);

        System.out.println(arr);
    }

    private static void inOrder(Node root, List<Integer> arr) {
        if (root == null) return;

        // Traverse left tree
        inOrder(root.left, arr);

        // add to list
        arr.add(root.data);

        // Traverse right tree
        inOrder(root.right, arr);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        left = right = null;
    }
}
