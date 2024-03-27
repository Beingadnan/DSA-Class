public class ddClass {

    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
        }
    }
    public static class doublylinklist{
        Node head=null;
        Node tail=null;

        boolean empty(){
            return head==null;
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

        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        doublylinklist dd=new doublylinklist();
        dd.addEnd(1);
        dd.addEnd(2);
        dd.addEnd(3);
        dd.display();


    }
}
