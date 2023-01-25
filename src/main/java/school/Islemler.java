package school;

import java.util.Scanner;
public class Islemler {

    public static void ogrenciEkle(){

        do {
            Scanner input = new Scanner(System.in);
            Ogrenci ogrenci = new Ogrenci();

            System.out.println("Öğrenci ismi giriniz...:");
            ogrenci.setAdSoyad(input.nextLine());

            System.out.println("Öğrenci kimlik no giriniz...:");
            ogrenci.setKimlikNo(input.next());

            System.out.println("Öğrenci yaşı giriniz...:");
            ogrenci.setYas(input.nextInt());

            System.out.println("Öğrenci Numarası giriniz...:");
            ogrenci.setNumara(input.next());

            System.out.println("Öğrenci sınıfı giriniz...:");
            ogrenci.setSinif(input.next());

            ogrenci.listeyeOgrenciEkle(ogrenci);
            System.out.println("Ogrenci listeye eklenmiştir");
            System.out.println(ogrenci);


        }while(true);//ÇIKIŞ  eklenecek
    }

    public void sil(){

    }
    public void ara(){

    }
    public void listele(){

    }


}
