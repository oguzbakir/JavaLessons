import java.util.Scanner;

public class HesapMakinesiTaslak {

    /*Kodu kopyalayip yapistirdiginizda class ismi farkli oldugundan dolayı hata alabilirsiniz
      Class ismi burda yukaridaki gibi "HesapMakinesiTaslak". Sizin class dosyanizin ismi ne ise
      Ona gore degistirebilirsiniz.
     */

    public static void main(String[] args) {
        // Scanner objemizi olusturuyoruz.
        Scanner scanner = new Scanner(System.in);
        /* Kullanıcıya yapabilecegi secenekleri sunuyoruz. Bunlar:
           (1) Toplama
           (2) Cikarma
           (3) Carpma
           (4) Bolme
           Asagida Toplama islemini ben yaptim siz kalan islemleri benzer sekilde tamamlayin.
         */
        System.out.println("(1) Toplama");

        System.out.println("Bir islem numarasi seciniz: ");
        // Kullanicinin secimini sakliyoruz. Daha sonra if ile yaptigi secime gore islem yapacagiz.
        int secim = scanner.nextInt();

        // Kullanicidan iki sayi istiyoruz ve
        System.out.println("İki sayi giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        // Eger secim 1 e esitse kullaniciginin girdigi iki sayiyi topla ve ekrana bastir.
        if (secim == 1) {
            int total = sayi1 + sayi2;
            System.out.println(sayi1 + " + " + sayi2 + " = " + total);
        }
        // Kalan islemleri benzer sekilde yazin.
    }
}
