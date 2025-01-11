package com.adhoc.progpractice.ds;

public class LinkListDemo1 {
    public static void main(String[] args) {
        Node head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);

//        head.next.next.next.next.next = head.next.next;
        detectLoop(head);
        printList(head);
    }

    protected static void printList(Node current) {
        while(current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(current.data);
    }

    protected static void detectLoop(Node node) {

        // If list is empty or has only one node
        // without loop

        if(node == null || node.next == null) {
            return;
        }

        // create slow and fast node
        Node slow = node, fast = node;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow.next == fast.next) {
                removeLoop(node, slow, fast);
            }
        }


    }

    protected static void removeLoop(Node node, Node slow, Node fast) {

        slow = node;

        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }

        fast.next = null;

    }
}
