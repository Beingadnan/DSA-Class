public class CircularLinklist {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class circularLinklist{
        Node head=null;

        void insert(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                newNode.next=head;
            }
            else{
                Node  temp=head;
                while (temp.next!=head) {
                    temp=temp.next;
                }
                temp.next=newNode;
                newNode.next=head;
            }
        }

        void display(){
            Node temp=head;
            if(head==null){
                System.out.println("null");
            }
            do {
                System.out.print(temp.data+"-->");
                temp=temp.next;
            } while (temp!=head);
            System.out.println("head");
        }

        void delete(int data){
            if(head==null){
                System.out.println("Already Empty");
                return;
            }
            Node temp=head;
            Node pre=null;
            do {
                if(temp.data==data){
                    break;
                }
                pre=temp;
                temp=temp.next;
            } while (temp!=head);
            if(temp==head){
              Node last=head;
              while(last.next!=head){
                last=last.next;
              }
              if(head==last){
                head=null;
              }
              else if(temp.data!=data){
                System.out.println("Element not found");
              }
              else{
                head=head.next;
                last.next=head;
              }
            }

        }

    }
public static void main(String[] args) {
    circularLinklist cc=new circularLinklist();
    cc.insert(1);
    cc.insert(2);
    cc.insert(3);
    cc.display();
    cc.delete(2);
}
}