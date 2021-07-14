package collections.arraylist;

import java.util.Scanner;

public class ArrayListMiniProject {

    public static void main(String[] args) {
        ArrayListManager manager=new ArrayListManager();
        Scanner keyboard=new Scanner(System.in);
        boolean quit=false;
        int choose;
        while (!quit){
        System.out.println("Yoklama Uygulamasına Hosgeldiniz:\n" +
                "1-Elemanları Görüntüle:\n" +
                "2-Eleman Ekle:\n"+
                "3-Eleman Güncelle:\n"+
                "4-Eleman Sil: \n"+
                "Default-Cikis:");
        System.out.print("Lütfen seciminizi giriniz:");
            choose=keyboard.nextInt();
            switch (choose){
                case 1:
                    manager.list();
                    break;
                case 2:
                    keyboard.nextLine();
                    String name=keyboard.nextLine();
                manager.add(name);
                break;
                case 3:
                    System.out.println("Güncellemek istediğiniz index'i ve eleman'ı giriniz");
                    int position=keyboard.nextInt();
                    keyboard.nextLine();
                    String newName=keyboard.nextLine();

                        manager.update(newName, position);

                break;
                case 4:
                    try {
                        keyboard.nextLine();
                        System.out.println("Silmek istediğiniz eleman'ı giriniz");
                        int deletePosition=keyboard.nextInt();
                        manager.delete(deletePosition);

                    }catch (Exception exception){
                        System.out.println("Hata Oluştu:"+exception);
                    }
                    break;
                default:
                    quit=true;
                    System.out.println("Cıkıs Yapılıyor");
                    break;
            }
        }
    }

}
