import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Revison {
    public static void main(String[] args) {
       HashMap<String,Integer>map=new HashMap<>();
       map.put("Adnan",19);
       map.put("Taj",21);

       System.out.println(map.get("Adnan"));
       System.out.println(map.getOrDefault("CA", 20));
       map.remove("Adnan");
       System.out.println(map);

    }
}