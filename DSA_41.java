public class DSA_41 {
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
        public static Node remove_Dup(Node head){
            Node current = head;
            while(current != null && current.next != null){
                if(current.data == current.next.data){
                    current.next = current.next.next;
                }
                else{
                    current = current.next;
                }
            }
            return head;
        }
        public static void printList(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String args[]){
        LinkedList list = new LinkedList();
        list.head = new Node(21);
        list.head.next = new Node(22);
        list.head.next.next = new Node(22);
        list.head.next.next.next = new Node(24);
        list.head.next.next.next.next = new Node(25);
        list.head.next.next.next.next.next = new Node(25);
        list.head.next.next.next.next.next.next = new Node(27);
        list.head.next.next.next.next.next.next.next = new Node(28);

        System.out.println("THE ORIGINAL LINKED LIST");
        list.printList(list.head);

        
        list.head = list.remove_Dup(list.head);
        System.out.println("THE LINKED LIST AFTER REMOVAL OF DUPLICATES");
        list.printList(list.head);
    }
}
