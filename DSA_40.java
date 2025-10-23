public class DSA_40 {
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList{
        Node head;
        public static Node rotateLinked(Node head, int k){
            Node tail = head;
            int length = 1;
            while(tail.next != null){
                tail = tail.next;
                length++;
            }
            tail.next = head;
            k = k % length;
            int newTail_index = length - k;
            Node newTail = head;
            for(int i = 1; i < newTail_index; i++){
                newTail = newTail.next;
            }
            Node newHead = newTail.next;
            newTail.next = null;
            return newHead;
        }
        public static void printList(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "-->");
                temp =temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.head = new Node(21);
        list.head.next = new Node(22);
        list.head.next.next = new Node(23);
        list.head.next.next.next = new Node(24);
        list.head.next.next.next.next = new Node(25);
        list.head.next.next.next.next.next = new Node(26);
        list.head.next.next.next.next.next.next = new Node(27);
        list.head.next.next.next.next.next.next.next = new Node(28);

        System.out.println("THE ORIGINAL LINKED LIST");
        list.printList(list.head);

        int k = 2;
        list.head = list.rotateLinked(list.head, k);
        System.out.println("THE LINKED LIST AFTER ROTATION OF "+ k + "POSTION");
        list.printList(list.head);



    }
}
