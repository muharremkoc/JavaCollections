package collections.map.hashmap;

import java.util.Scanner;

public class HashMapMiniProject {
    public static void main(String[] args) {
        HashMapManager manager = new HashMapManager();
        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        int choose;
        while (!quit) {
            System.out.println("Yoklama Uygulamasına Hosgeldiniz:\n" +
                    "1-Elemanları Görüntüle:\n" +
                    "2-Eleman Ekle:\n" +
                    "3-Eleman Güncelle:\n" +
                    "4-Eleman Sil: \n" +
                    "Default-Cikis:");
            System.out.print("Lütfen seciminizi giriniz:");
            choose = keyboard.nextInt();
            switch (choose) {
                case 1:
                    manager.list();
                    break;
                case 2:

                    keyboard.nextLine();
                    String name=keyboard.nextLine();
                    manager.add(name);
                    break;
                case 3:
                    int updateChoose = keyboard.nextInt();
                    keyboard.nextLine();
                    String newName=keyboard.nextLine();
                    manager.update(updateChoose,newName);
                    break;
                case 4:
                    int deleteChoose=keyboard.nextInt();
                    manager.delete(deleteChoose);
                    break;
                default:
                    System.out.println("Cıkıs Yapılıyor");
                    break;
            }
        }
    }
}
