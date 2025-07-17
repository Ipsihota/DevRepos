package interview.test;

public class LinkListMain {


//    Input: head = [1,2,3,3,4,4,5]
//    Output: [1,2,5]
//    remove duplicates using singly link list

    public static void main(String[] args) {
        LNode lNode = new LNode(1);
        lNode.next = new LNode(2);
        lNode.next.next = new LNode(3);
        lNode.next.next = new LNode(3);
        lNode.next.next = new LNode(4);
        lNode.next.next = new LNode(4);
        lNode.next.next = new LNode(5);

        findDuplicateLL(lNode);
    }

    private static void findDuplicateLL(LNode lNode) {

        LNode ptr1 = lNode;
        LNode ptr2 = lNode.next;
        System.out.println(ptr1.data);
        System.out.println(ptr2.data);
        while (ptr1.next != null && ptr2.next != null) {
            System.out.println(ptr2.data);

            if(ptr1.data == ptr2.data) {
                ptr1.next = ptr1.next.next;
                ptr2.next = ptr2.next.next;
            } else {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;

            }
        }

    }


}

class LNode {

    int data;
    LNode next;

    public LNode(int data) {
       this.data = data;
       next = null;
    }
}
