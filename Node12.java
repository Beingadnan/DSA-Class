public class Node12 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    
    public static class linklist{
        Node head=null;
        Node tail=null;

        void insert(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
         void Display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }
        int Size(){  
            Node temp=head;
            int count=0;
            while (temp!=null) {
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertAtStart(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAt(int idx,int data){
            Node newNode=new Node(data);
            Node temp=head;
            if(idx==0){
                newNode.next=temp;
                head=newNode;
                return;
            }
            
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        int ElementAt(int idx){
            Node temp=head;
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void Delete(int idx){
            Node temp=head;
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
      public static Node reverseList(Node head){
        Node curr=head;
        Node prev=null;
        Node after=null;

        while(curr!=null){
            after=curr.next;
            curr.next=prev;
            prev=curr;
            curr=after;
        }
        return prev;
    }
}

    public static void main(String[] args) {
        linklist ll=new linklist();
        ll.insert(1);
        ll.insert(4);
        ll.insert(1);
        ll.insertAtStart(9);
        ll.insertAtStart(19);
        ll.Display();
        ll.insertAt(0,102);
        // ll.insertAt(0, 100);
        // ll.Display();
        System.out.println(ll.Size());
        // System.out.println(ll.ElementAt(4));
        // ll.Delete(3);
        // ll.Delete(10);

        ll.Display();

        ll.reverseList(null);
        ll.Display();
    }
}
