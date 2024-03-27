import org.w3c.dom.Node;
import java.util.*;

public class LinkedList {


    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void Display(Node Head){
        Node temp=Head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public static void DisplayRecursivley(Node head){
        // Node temp=head;
        if(head==null){
            return;
        }
        System.out.println(head.data);
        DisplayRecursivley(head.next);
    }

    public static void Reverse(Node head){
        if(head==null){
            return;
        }
        Reverse(head.next);
        System.out.println(head.data);
    }
    public static int Length(Node a){
        int count=0;
        while(a!=null){
            count++;
            a=a.next;
        }
        return count;
    }
    public static void main(String[] args) {
       Node a= new Node(6);
       Node b=new Node(8);
       Node c=new Node(9);
       Node d=new Node(7);
       Node e= new Node(11);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;

    //    Display(a);
    //    DisplayRecursivley(a);
    //    Reverse(a);
    //    int len=Length(a);
    //    System.out.println(len);
    //    System.out.println(a.next.data);
    //    System.out.println(b.next.data);

    //    for(int i=0;i<=5;i++){
    //     System.out.println(temp.data);
    //     temp=temp.next;
    //    }
        
    }
}
