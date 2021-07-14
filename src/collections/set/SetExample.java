package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();

        Set<String> set2 = new HashSet<>();

        set1.add("Muharrem");
        set1.add("John");
        set1.add("Johnson");
        set1.add("Johnny");
        System.out.println("Set1: " + set1);
        set2.add("Muharrem");
        set2.add("John");
        set2.add("Johnny");
        set2.add("Johnson");
        set2.add("Ken");
        System.out.println("Set2: " + set2);
        System.out.println("SubSet is: " + set2.containsAll(set1));
    }
}
