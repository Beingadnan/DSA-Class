import java.util.Queue;
import java.util.LinkedList;
public class Queue1 {
    public static void main(String[] args) {
        //We can't make Direct Queue object so we make with linkedList.
        Queue<Integer>queue=new LinkedList<>();  
        
        // Add Elements--> add(), offer
        queue.add(5);
        queue.offer(7);  // Add another method

        // Peek-->Batata hai element first element
        System.out.println(queue.peek());
        System.out.println(queue.element());

    // Clear
        // queue.clear();

    // Remove
        queue.poll();
        queue.remove(7);
    // size
        System.out.println(queue.size());

    // isEmpty
        System.out.println(queue.isEmpty());

        System.out.println(queue);

    }
}