package collections.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {


        ArrayList<String> arrayList=new ArrayList<>();

        //Index places
       arrayList.add("Turkey");
       arrayList.add("theUSA");
       arrayList.add("France");
       //Places the specified Index
        arrayList.add(3,"England");

        System.out.println(arrayList);

        arrayList.remove(1);
        System.out.println("After Remove");
        System.out.println(arrayList);





        arrayList.set(1,"Germany");
        System.out.println("After Set");
        System.out.println(arrayList);


        /*
    for (String array:arrayList)
          {
              System.out.println(array);
        }
   */
//System.out.println("Choosing element:"+arrayList.get(0));


        /*
           for (String array:arrayList)
        {
            System.out.println(array);
        }
         */


        /*
            for (String array:arrayList)
        {
            System.out.println(array);
        }
         */


    }
}
