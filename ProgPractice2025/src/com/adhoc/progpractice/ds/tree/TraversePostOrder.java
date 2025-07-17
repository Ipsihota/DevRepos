package com.adhoc.progpractice.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class TraversePreOrder {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        preOrder(root);
    }

    private static void preOrder(Node node) {
        List<Integer> arr = new ArrayList<>();

        preOrder(node, arr);

        System.out.println(arr);
    }

    private static void preOrder(Node root, List<Integer> arr) {
        if (root == null) return;

        // add to list
        arr.add(root.data);

        // Traverse left tree
        preOrder(root.left, arr);

        // Traverse right tree
        preOrder(root.right, arr);
    }
}

