package collections.map.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHash=new LinkedHashMap<>();

        linkedHash.put("One",1);
        linkedHash.put("Nine",9);
        linkedHash.put("Two",2);
        linkedHash.put("Six",6);
        linkedHash.put("Three",3);


        System.out.println(linkedHash);
        int removeLinkedHash=linkedHash.remove("Six");
        System.out.println("Removed Element:"+removeLinkedHash);
        System.out.println("Last Map:"+linkedHash);


        /*
    System.out.println("Get Methods:"+linkedHash.get("Nine"));
        System.out.println("keySet() Methods"+linkedHash.keySet());
        System.out.println("values() Methods"+linkedHash.values());
        System.out.println("entrySet() Methods:"+linkedHash.entrySet());
        */

        /*
          linkedHash.putIfAbsent("Three",4);
        linkedHash.putIfAbsent("Eight",7);
         */

    }
}
