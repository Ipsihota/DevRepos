package com.adhoc.progpractice.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BoundryNodeTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> finalList = printBoundary(root);
        finalList.stream().collect(Collectors.toList()).forEach(System.out::println);
    }

    private static List<Integer> printBoundary(Node root) {
        List<Integer> res = new ArrayList<>();

        if(root == null) {
            return res;
        }

        // add left boundary
        addLeftBoundary(root, res);
        // add right boundary
        addRightBoundary(root, res);
        // add leaves
        addLeaves(root, res);


        return res;
    }

    private static void addLeaves(Node root, List<Integer> res) {
        Node curr = root;
        while (curr != null) {
            if (!isLeafNode(curr)) {
                res.add(curr.data);
            }
        }
    }

    private static boolean isLeafNode(Node curr) {
        if(curr.left == null && curr.right == null) {
            return true;
        }
        return false;
    }

    private static void addRightBoundary(Node root, List<Integer> res) {
    }

    private static void addLeftBoundary(Node root, List<Integer> res) {
    }
}
