package collections.map.treemap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> tree=new TreeMap<>();
        tree.put(2,"Muharrem");
        tree.put(1,"John");
        tree.put(4,"Johnny");
        tree.put(15,"Jason");
        tree.put(35,"Jack");


        System.out.println(tree);



        /*
        tree.putIfAbsent(2,"Mahmut");
        tree.putIfAbsent(3,"Jackson");
         */


        /*
          System.out.println("Tree Using:"+tree);
        System.out.println("Get Methods:"+tree.get(4));
        System.out.println("keySet() Methods:"+tree.keySet());
        System.out.println("values() Methods:"+tree.values());
        System.out.println("entrySet() Methods:"+tree.entrySet());

         */


        /*
            String removeTreeElement=tree.remove(35);
        System.out.println("RemovedElement:"+removeTreeElement);
        System.out.println("Last Tree:"+tree);
         */


        /*
           System.out.println("Update:"+tree.replace(4,"Johnson"));
        System.out.println("Last Tree:"+tree);
         */


        /*
          int firstKey=tree.firstKey();
        int lastKey=tree.lastKey();

        System.out.println("FirstKey:"+firstKey);
        System.out.println("FirstEntry:"+tree.firstEntry());
        System.out.println("LastKey:"+lastKey);
        System.out.println("LastEntry:"+tree.lastEntry());
         */


        /*
         System.out.println("HighKey:"+tree.higherKey(4));
        System.out.println("HigherEntry:"+tree.higherEntry(2));
        System.out.println("LowerKey:"+tree.lowerKey(15));
        System.out.println("LowerEntry:"+tree.lowerEntry(2));
        System.out.println("CeilingKey:"+tree.ceilingKey(3));
        System.out.println("CeilingEntry:"+tree.ceilingEntry(3));
        System.out.println("FloorKey:"+tree.floorKey(35));
        System.out.println("FloorEntry:"+tree.floorEntry(35));
         */


        /*
                 System.out.println("Polled First:"+tree.pollFirstEntry());
        System.out.println("Polled Last:"+tree.pollLastEntry());
        System.out.println("After Polling:"+tree);

          */


        /*
        System.out.println(tree.headMap(3));
        System.out.println(tree.headMap(4,true));
         */


        /*
            System.out.println(tree.tailMap(4));
        System.out.println(tree.tailMap(4,false));
         */


        /*
         System.out.println("SubMap not using boolean:"+tree.subMap(1,15));
        System.out.println("SubMap using boolean:"+tree.subMap(
                1,false,
                15,true));
         */













































    }
}
