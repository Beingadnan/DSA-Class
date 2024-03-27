public class DoublyLinkedList {

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static class doublylinklist {
        Node head;
        Node tail;

        boolean empty(){
            return head==null;
        }

        void addStart(int data){
            Node newNode=new Node(data);
            if(empty()) {
                head=newNode;
                tail=newNode;
            }
            else{
                newNode.next=head;
                head.prev=newNode;
                head=newNode;
            }
        }
        void addEnd(int data){
            Node newNode=new Node(data);
            if(empty()){
                head=newNode;
                tail=newNode;
            }
            else{
                newNode.prev=tail;
                tail.next=newNode;
                tail=newNode;
            }
        }
        void startTraversal(){
            Node temp=head;
            if(!empty()){
                System.out.print(" null <->");
            }
            while(temp!=null){
                System.out.print(temp.data+" <-> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
        void endTraversal(){
            Node temp=tail;
            if(!empty()){
                System.out.print(" null <-> ");
            }
            while(temp!=null){
                System.out.print(temp.data+" <-> ");
                temp=temp.prev;
            }
            System.out.println("null");
        }
        
        void delete(int data) {
            if (empty()) {
                System.out.println("List is Empty");
                return;
            }
        
            Node temp = head;
            while (temp != null && temp.data != data) {
                temp = temp.next;
            }
        
            if (temp == null) {
                System.out.println("Element not found");
                return;
            }
        
            if (temp.prev != null) {
                temp.prev.next = temp.next;
            } else {
                head = temp.next;
            }
            if (temp.next != null) {
                temp.next.prev = temp.prev;
            } else {
                tail = temp.prev;
            }
        }
        
        
    }
    public static void main(String[] args) {
       doublylinklist ll=new doublylinklist();
       ll.addStart(4);
       ll.startTraversal();
                                 System.out.println();
       ll.addStart(3);
       ll.startTraversal();
                                 System.out.println();
       ll.addStart(2);
       ll.startTraversal();
                                 System.out.println();
       ll.addStart(1);
       ll.startTraversal();
                                 System.out.println();
       ll.delete(1);


       ll.startTraversal();
                                 System.out.println();
       ll.endTraversal();
 
       

    }
}
