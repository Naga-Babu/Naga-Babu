

import java.util.*;
 

public class LHmap {
 
    
    public static void main(String a[])
    {
 
        
        LinkedHashMap<String, String> lhm
            = new LinkedHashMap<String, String>();
 
      
        lhm.put("one", "nagababu6294@gmail.com");
        lhm.put("two", "venkatnagababu996@gmail.com");
        lhm.put("three", "Venkatanagababu");
 
      
        System.out.println(lhm);
 
     
 
        
        System.out.println("Getting value for key 'one': "
                           + lhm.get("one"));
 
      
        System.out.println("Size of the map: "
                           + lhm.size());
 

        System.out.println("Is map empty? "
                           + lhm.isEmpty());
 
      
        System.out.println("Contains key 'two'? "
                           + lhm.containsKey("two"));
 
        
        System.out.println(
            "Contains value 'Nagababu"
            + "Harika'? "
            + lhm.containsValue("practice"
                                + "venkatnagababu996@gmail.com"));
 
    
        System.out.println("delete element 'one': "
                           + lhm.remove("one"));
 
      
        System.out.println("Mappings of LinkedHashMap : "
                           + lhm);
    }
}