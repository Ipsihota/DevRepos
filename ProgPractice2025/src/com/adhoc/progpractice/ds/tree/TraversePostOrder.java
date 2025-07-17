package com.adhoc.progpractice.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class TraversePostOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        postOrder(root);
    }

    private static void postOrder(Node node) {
        List<Integer> arr = new ArrayList<>();

        postOrder(node, arr);

        System.out.println(arr);
    }

    private static void postOrder(Node root, List<Integer> arr) {
        if (root == null) return;

        // Traverse left tree
        postOrder(root.left, arr);

        // Traverse right tree
        postOrder(root.right, arr);

        // add to list
        arr.add(root.data);
    }
}

