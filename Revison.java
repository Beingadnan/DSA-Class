import java.util.Stack;

public class Revison {
    public static void main(String[] args) {
        Stack<Integer>stc=new Stack<>();

        stc.push(1);
        stc.push(2);
        stc.push(3);

       System.out.println( stc.peek());  // 3

       System.out.println(stc.isEmpty());

       System.out.println(stc.pop());



        System.out.println(stc);
    }
}