package collections.arraylist;

import java.util.ArrayList;

public class ArrayListManager {
    ArrayList<String> personNames=new ArrayList<>();
    public void list(){
        if (!personNames.isEmpty()){
            for (int i=0;i<personNames.size();i++){
                System.out.println((i+1)+".Kisi:"+personNames.get(i));
            }
        }
        if (personNames.isEmpty()){
            System.out.println("Listeniz bos eleman ekleyiniz!!!");
            System.out.println("--------------------------");
        }
    }
    public void add(String name){
        personNames.add(name);
        System.out.println("Eleman Ekleme Basarili!!!");
        System.out.println("--------------------------");
    }
    public void update(String name,int index){

            personNames.set(index,name);
            System.out.println("Eleman Basariyla Güncellendi");
            System.out.println("--------------------------");
    }
    public void delete(int index){
        String choosingName=personNames.get(index);
            personNames.remove(index);
        System.out.println("Secilen Eleman:"+choosingName);
            System.out.println("Eleman Basariyla Silindi!");
            System.out.println("--------------------------");

    }

}
