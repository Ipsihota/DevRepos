package com.adhoc.progpractice.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<List<Integer>> finalList = levelOrder(root);
        finalList.stream().collect(Collectors.toList()).stream().forEach(System.out::println);
    }

    protected static List<List<Integer>> levelOrder(Node root) {
        // Two ds we have to use Queue [to traverse] and List<List<Integer>> [to store level with element]

        Queue<Node> nodeQueue = new LinkedList<>();

        List<List<Integer>> levelList = new ArrayList<>();

        if(root == null) return levelList;
        nodeQueue.offer(root);
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if(nodeQueue.peek().left != null) nodeQueue.offer(nodeQueue.peek().left);
                if(nodeQueue.peek().right != null) nodeQueue.offer(nodeQueue.peek().right);
                subList.add(nodeQueue.poll().data);
            }
            levelList.add(subList);
        }

        return levelList;
    }
}
