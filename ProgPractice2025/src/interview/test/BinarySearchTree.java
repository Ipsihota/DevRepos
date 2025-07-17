package interview.test;

public class BinarySearchTree {


    public static void main(String[] args) {
        BtreeNode root = new BtreeNode(1);
        root.left = new BtreeNode(2);
        root.right = new BtreeNode(3);
        root.left.left = new BtreeNode(4);
        root.left.right = new BtreeNode(5);

        removeNode(root);
    }

    private static void removeNode(BtreeNode root) {

        if(root == null) return;

        if(root.right != null && root.left != null) {

        }


        while(root.left.left != null || root.left.right != null) {
            root.left = root.left.left;
//            root.left = null;
            root.right = root.right.right;

        }
    }


}

class BtreeNode {
    int data;
    BtreeNode left;
    BtreeNode right;

    public BtreeNode(int data){
        this.data = data;
        left = right = null;
    }


}
