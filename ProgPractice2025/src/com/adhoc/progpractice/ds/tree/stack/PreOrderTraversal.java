package com.adhoc.progpractice.ds.tree.stack;

import com.adhoc.progpractice.ds.tree.Node;

import java.util.*;

public class PreOrderTraversal {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> list = preOrderUsingStk(root);
//        list.stream().forEach(System.out::print);
        System.out.print("Preorder Traversal: ");
        for (int val : list) {
            System.out.print(val + " ");
        }
    }

    private static List<Integer> preOrderUsingStk(Node root) {
        List<Integer> listTraversal= new ArrayList<>();

        if(root == null) return listTraversal;

        Stack<Node> stk = new Stack<>();

        stk.push(root);

        while (!stk.empty()) {
            root = stk.pop();

            listTraversal.add(root.data);

            if(root.right != null) {
                stk.push(root.right);
            }

            if(root.left != null) {
                stk.push(root.left);
            }

        }

        return listTraversal;
    }
}
