import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
    // Add Element
        list.add(4);
        list.add(6);
        list.add(7);
    // Set --> Set the Element
        list.set(1,10);
    
    // Clear--> Delete All the Element
        // list.clear();
    
    // Remove --> Delete the Index
        // list.remove(1);
    
    // Inserting one Particular Index
        list.add(1,8);
    
    // Get
        System.out.println(list.get(3));
        
        System.out.println(list);
    }
}
