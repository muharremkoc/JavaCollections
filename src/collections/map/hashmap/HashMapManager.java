package collections.map.hashmap;

import java.util.HashMap;

public class HashMapManager {
    HashMap<Integer, String> persons=new HashMap<>();
    int value;
    public void list(){
        if (!persons.isEmpty()){
            for (Integer person: persons.keySet()){
                System.out.println(person+".Kişi:"+persons.get(person));
            }
        }
        else {
            System.out.println("HashMap is Empty!!!!!!");
        }
    }
    public void add(String name){
        if (persons.isEmpty()){
            value=1;
            persons.put(value,name);
        }else{
            value++;
            persons.put(value,name);
        }
    }
    public void update(int chooseValue,String name){
        persons.replace(chooseValue,name);
    }
    public void delete(int chooseValue){
        String deletedName=persons.get(chooseValue);
        System.out.println("Choosing Name:"+deletedName);
        persons.remove(chooseValue);
    }
}
