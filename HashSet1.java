import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();

        // Add--> Adding Element
        set.add(6);
        set.add(3);
        set.add(1);
        set.add(3);
        set.add(2);
    
    // Remove
        // set.remove(1);

    // Contains
        System.out.println(set.contains(1));

    // System.out.println(set.size());

    for(int i:set){
        System.out.println(i);
    }

    System.out.println(set);

    }
}
