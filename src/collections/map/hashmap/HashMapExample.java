package collections.map.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {


        HashMap<Integer, String> hash=new HashMap<>();

        hash.put(2,"Muharrem");
        hash.put(1,"John");
        hash.put(4,"Johnny");
        hash.put(15,"Jason");
        hash.put(35,"Jack");
        System.out.println(hash);




        /*
        Remove Method:
            System.out.println(hash);
        String removeElement=hash.remove(4);
        System.out.println("Removing Element:"+removeElement);
        System.out.println("Last Hash:"+hash);
         */


        /*
             System.out.println("Get Methods:"+hash.get(4));
        System.out.println("keySet(); Methods:"+hash.keySet());
        System.out.println("Values(); Methods:"+hash.values());
        System.out.println("entrySet(); Methods:"+hash.entrySet());
         */



    }
}
