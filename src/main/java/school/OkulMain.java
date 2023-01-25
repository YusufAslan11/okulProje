package school;

import java.util.Scanner;

public class OkulMain extends Islemler {

    static Scanner input = new Scanner(System.in);
    private static Object listeyeOgrenciEkle;


    public static void main(String[] args) {

        do {
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒ ÖĞRENCİ ve ÖĞRETMEN YÖNETİM PLANI ▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒1 - Öğrenci İşlemleri  ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒2 - Öğretmen İşlemleri ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒3 - ÇIKIŞ              ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            int selectAnaMenu = input.nextInt();
            if (selectAnaMenu == 1) {
                do {
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ Öğrenci İşlemleri ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒1- Öğrenci Ekle              ▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒2- Öğrenci Arama             ▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒3- Öğrenci Listeleme         ▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒4- Öğrenci Kayıt silme       ▒▒▒▒▒▒▒▒▒▒▒▒▒ ");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒5- Çıkış                     ▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    int selectAltMenu = input.nextInt();
                    if (selectAltMenu == 1) {
                        ogrenciEkle();
                    } else if (selectAltMenu == 2) {

                        // arama();
                    } else if (selectAltMenu == 3) {
                        //listeleme();
                    } else if (selectAltMenu == 4) {
                        // silme();
                    } else if (selectAltMenu == 5) {
                        break;
                    } else {
                        System.out.println("Hatalı giriş yaptınız!!!");
                    }
                } while (true);

            } else if (selectAnaMenu == 2) {

                do {
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ Öğretmen İşlemleri ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒1- Öğretmen Ekle              ▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒2- Öğretmen Arama             ▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒3- Öğretmen Listeleme         ▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒4- Öğretmen Kayıt silme       ▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒5- Ana Sayfa                  ▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                    System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                    int selectAltMenu2 = input.nextInt();
                    if (selectAltMenu2 == 1) {
                        //ekle();
                    } else if (selectAltMenu2 == 2) {
                        // arama();
                    } else if (selectAltMenu2 == 3) {
                        //listeleme();
                    } else if (selectAltMenu2 == 4) {
                        // silme();
                    } else if (selectAltMenu2 == 5) {
                        break;

                    } else {
                        System.out.println("Hatalı giriş yaptınız!!!");
                    }
                } while (true);

            } else if (selectAnaMenu == 3) {
                System.out.println("Teşekkür ederiz");
                break;

            } else {
                System.out.println("Hatalı giriş yaptınız");
            }

        } while (true);

    }


}