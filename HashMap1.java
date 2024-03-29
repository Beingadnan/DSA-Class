import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();

    // Add
        map.put("Car",19);
        map.put("Bike",20);

    // get(key)
        // System.out.println(map.get("Bike"));
        // System.out.println(map.get("Car"));

    // GetOrDefault
        // System.out.println(map.getOrDefault("cat", 10));
    
    // Map
        // map.remove("Car");

    // Contains Key
        // System.out.println(map.containsKey("Car"));

    // Clear-->Delete All the Element
        // map.clear();

// Iterate
    // To get Key-->
        for(String i:map.keySet()){
            System.out.println(i+":"+map.get(i));
        }
    // To get Value-->
        //  for(int i:map.values()){
        //     System.out.println(i);
        //  }
        
        //  System.out.println(map.size());
       System.out.println(map);


    }
}
