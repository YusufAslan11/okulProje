package school;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulMain {

    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {


        do {
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒ ÖĞRENCİ ve ÖĞRETMEN YÖNETİM PLANI ▒▒▒▒▒▒▒▒▒▒");
            System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

            System.out.println("1 - Öğrenci İşlemleri");
            System.out.println("2 - Öğretmen İşlemleri");
            System.out.println("Q - ÇIKIŞ");

            int select = input.nextInt();
            String select1 = input.next();

            if (select == 1) {
                System.out.println("Öğrenci İşlemleri");
                System.out.println("=================");





            } else if (select == 2) {
                System.out.println("Öğretmen İşlemleri");
                System.out.println("==================");





            } else if (select1.equalsIgnoreCase("Q")) {
                System.out.println("Teşekkür ederiz");


            } else {
                System.out.println("Hatalı giriş yaptınız");
            }

        }while(true);
    }
}