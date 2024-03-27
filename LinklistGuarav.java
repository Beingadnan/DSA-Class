class Node{
    int data;
    Node next;
   public Node(int data){
        this.data=data;
        this.next=null;
    }
}
 class LinklistGuarav {
    Node Head=null;
    Node Tail=null;
    public  void append(int data){
        Node newNode=new Node(data);
        if(Head==null){
            Head=newNode;
        }
        else{
            Node dup=Head;
            while (dup.next!=null) {
                dup=dup.next;
            }
            dup.next=newNode;
        }
        
    }
    public void Display(){
        if(Head==null){
            System.out.println("empty");
        }
        else{
            Node dup=Head;
            while (dup!=null) {
                System.out.print(dup.data+"->");
                dup=dup.next;
            }
            System.out.println("null");
        }
    } 
    public  void start(int data){
        Node newNode=new Node(data);
        newNode.next=Head;
        Head=newNode;
    }
    public  void Delete(int indx){
        Node temp=Head;
        if(Head==null) return ;
        for(int i=1;i<indx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        
    }
    public void Deletedata(int data){
        if(Head==null) return;
        if(Head.data==data){
            Head=Head.next;
            return;
        }
        Node temp=Head;
        while (temp.next!=null && temp.next.data!=data) {
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }else{
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        LinklistGuarav linklist=new LinklistGuarav();
        linklist.append(1);
        linklist.append(2);
        linklist.append(3);
        linklist.start(12);
        linklist.Display();
        // linklist.Delete(22);
        // linklist.Deletedata(3); 
        linklist.Display();

    }
}
