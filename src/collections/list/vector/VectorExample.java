package collections.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String> names=new Vector<>();

        names.add("Muharrem");
        names.add("John");
        names.add("Jack");
        names.add(3,"Adam");


        System.out.println(names);
        names.clear();
        System.out.println(names);


        System.out.println("Choosing Vector's Element:"+names.get(0));



        Iterator<String>iterator=names.iterator();
        while (iterator.hasNext()){
            System.out.println(" "+iterator.next());
        }


        Vector<String> lastNames=new Vector<>();
        lastNames.add("Koc");
        lastNames.add("Smith");
        lastNames.add("Johnson");
       names.addAll(lastNames);
        System.out.println(names);


    }
}
