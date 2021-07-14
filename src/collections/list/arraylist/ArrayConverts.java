package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConverts {
    public static void main(String[] args) {
        //ArrayList to Array Convertion;
        ArrayList<String> names = new ArrayList<>();
        names.add("Muharrem");
        names.add("Davut");
        names.add("Mihrali");




        System.out.println(" "+names);
        //ArrayList to String Convertion
        String newList;
        newList=names.toString();
        System.out.println("ArrayListToString:"+newList);





        String[] arr=new String[names.size()];

        names.toArray(arr);
        System.out.println("ArrayListToArray:");
        for (String name:arr) {
            System.out.println(" "+name);
        }

        //Array to ArrayList Conevertion
        ArrayList<String> arrayList=new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayToArrayList:"+arrayList);



    }
}
