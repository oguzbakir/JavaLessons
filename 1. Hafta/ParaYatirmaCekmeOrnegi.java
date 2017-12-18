package com.company;

import java.util.Scanner;

public class ParaYatirmaCekmeOrnegi {

    public static void main(String[] args) {

        int bakiye = 425; //Arkadas KYK aliyor :)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Su anki bakiye miktariniz : " + bakiye);
        System.out.println("(1) Para Cekme");
        System.out.println("(2) Para Yatirma");
        System.out.println("Yapmak istediginiz islem numarsini giriniz");

        int secim = scanner.nextInt(); //Kullanicinin secimini tutuyoruz.

        if (secim == 1) {
            /* Buradaki bakiye == 0 in ustu sari renkle cizili buun sebebi bakiyenin hicbir
               zaman 0 a esit olmayacagini dolayisiyla boyle bir if statementı kullanmamizin
               gereksiz oldugunu soyluyor. İleriki derslerde kullanimini gerekli hale getirip
               daha detayli inceleyecegiz :)
             */
            if (bakiye == 0) {
                System.out.println("Bakiyenizde para bulunmamaktadir");
            }
            else {
                System.out.println("Cekmek istediginiz miktari giriniz: ");
                int miktar = scanner.nextInt(); //Cekmek istenilen miktari tutuyoruz.

                if (miktar > bakiye) { //Bakiyeden fazla para cekmek isterse izin vermiyoruz.
                    System.out.println("Hesabinizda bu kadar para bulunmamaktadir.");
                }
                else {
                    bakiye -= miktar; //Bu ifade bakiye = bakiye - miktar ile aynı sey.
                    System.out.println("Kalan bakiye miktariniz : " + bakiye);
                }
            }
        }

        else if (secim == 2) {
            System.out.println("Yatirmak istediginiz miktari giriniz: ");
            int yatirilmakIstenenMiktar = scanner.nextInt(); //Degisken ismini camelCase kuraliyla yazdim.
            bakiye += yatirilmakIstenenMiktar; //Bakiyeyi guncelliyoruz.
            System.out.println("Hesabinizdaki bakiye: " + bakiye);
        }

        else {
            // 1 veya 2 disinda bir deger girilirse verilecek hata mesaji
            System.out.println("Gecerli bir islem numarasi giriniz!");
        }
    }
}
