package org.example.java8.iteration;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class EnhancedForloop {
    /**
     * hash has no insertion order
     * same for all implemented class too
     * @param args
     */
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Name","Vinod"); // inserting string in both key and value
        map.put("Email","Vinod-it@gmail.com");
        map.put("city","Delhi");
        map.put("Age","25"); // accepting string as key and integer as value

        // keyset() gives the set of keys and by making obj of Set , we can store the keys in it
        Set<String> obj = map.keySet();

        //Enhanced for each loop taking all keys and iterating on it
        for(String key:obj){
            System.out.println(key+" :"+map.get(key));
        }

    }
}
