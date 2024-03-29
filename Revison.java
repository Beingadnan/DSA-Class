import java.util.LinkedList;
import java.util.Queue;

public class Revison {

    public static void main(String[]args){
        Queue <Integer>queue=new LinkedList<>();

        queue.add(1);
        queue.offer(2);

        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
        // queue.remove(2);
        queue.poll();
        // queue.clear();
        System.out.println(queue);
    }
}