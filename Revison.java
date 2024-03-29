import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class Revison {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(4);

        set.remove(1);
       System.out.println( set.contains(2));
        System.out.println(set);
    }
}