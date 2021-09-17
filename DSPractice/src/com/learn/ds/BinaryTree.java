package com.learn.ds;

// Java implementation to find leaf count of a given Binary tree

/* Class containing left and right child of current
node and key value*/
class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

public class BinaryTree
{
    //Root of the Binary Tree
    Node root;

    /* Function to get the count of leaf nodes in a binary tree*/
    int getLeafCount()
    {
        return getLeafCount(root);
    }

    int getLeafCount(Node node)
    {
        int res=0;

        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            System.out.println("Debug: " + node.left.data + " -- " + node.right.data);
            res = getLeafCount(node.left) + getLeafCount(node.right);
            return res;
    }

    /* Driver program to test above functions */
    public static void main(String args[])
    {
        /* create a tree */
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        /* get leaf count of the abve tree */
        System.out.println("The leaf count of binary tree is : "
                + tree.getLeafCount());
    }
}


<<<<<<< HEAD
=======
package com.learn.ds;public class BinaryTree {
}
>>>>>>> 82a325f1a6f8400ed639603555d00e13f4e7beaa
