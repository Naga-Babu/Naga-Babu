import java.util.*;
import java.util.concurrent.*;
  

public class treemap {
  

    static void Example1stConstructor()
    {

        TreeMap<Integer, String> tree_map
            = new TreeMap<Integer, String>();
  
    
        tree_map.put(10, "venkata");
        tree_map.put(15, "Durga");
        tree_map.put(20, "Nagababu");
    
  
        System.out.println("TreeMap: " + tree_map);
    }
  
  
    public static void main(String[] args)
    {
        System.out.println("TreeMap using "
                           + "TreeMap() constructor:\n");
  
      
        Example1stConstructor();
    }
}