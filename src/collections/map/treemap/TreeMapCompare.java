package collections.map.treemap;

import java.util.TreeMap;

public class TreeMapCompare {
    public static void main(String[] args) {
        TreeMap<Integer, String> beforeTree=new TreeMap<>();
        beforeTree.put(2,"Muharrem");
        beforeTree.put(1,"John");
        beforeTree.put(4,"Johnny");
        beforeTree.put(15,"Jason");
        beforeTree.put(35,"Jack");


        System.out.println("Before Compare:"+beforeTree);
        Comparate comparate=new Comparate();
        TreeMap<Integer, String> compareTree=new TreeMap<>(comparate);
        compareTree.put(2,"Muharrem");
        compareTree.put(1,"John");
        compareTree.put(4,"Johnny");
        compareTree.put(15,"Jason");
        compareTree.put(35,"Jack");
        System.out.println("After Compare:"+compareTree);

    }
}
