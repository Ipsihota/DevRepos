package com.adhoc.progpractice.ds.tree.stack;

import com.adhoc.progpractice.ds.tree.Node;

import java.util.*;

public class InPrePostTreeTraverse {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        inPrePost(root);
    }

    private static void inPrePost(Node root) {
        List<Integer> preOrderList =new ArrayList<>();
        List<Integer> inOrderList =new ArrayList<>();
        List<Integer> postOrderList =new ArrayList<>();

        Stack<AbstractMap.SimpleEntry<Node, Integer>> stkPair = new Stack<>();
        if(root == null) return;
        // push the root node first to stack.
        stkPair.push(new AbstractMap.SimpleEntry<>(root, 1));

        while (stkPair != null) {
            AbstractMap.SimpleEntry<Node, Integer> pair = stkPair.pop();

            if(pair.getValue() == 1) { // pre-order
                //Add to pre list
                // increment the value and
                // push into stack[left node]
                preOrderList.add(pair.getKey().data);
//                var val = pair.getValue()++;
                if(pair.getKey().left != null) {
                    stkPair.push(new AbstractMap.SimpleEntry<>(pair.getKey().left, pair.getValue()+1));
                }
            }

            if(pair.getValue() == 2) { // in-order
                //Add to in list
                // increment the value and
                // push into stack[right node]
                inOrderList.add(pair.getKey().data);
                if(pair.getKey().right != null) {
                    stkPair.push(new AbstractMap.SimpleEntry<>(pair.getKey().right, pair.getValue()+1));
                }
            }

            if(pair.getValue() == 3) { //post-order
                //Add to post list
                postOrderList.add(pair.getKey().data);
            }
        }

        System.out.println("Preorder:");
        preOrderList.stream().forEach(System.out::println);

        System.out.println("Inorder:");
        inOrderList.stream().forEach(System.out::println);


        System.out.println("Postorder:");
        postOrderList.stream().forEach(System.out::println);




    }
}
