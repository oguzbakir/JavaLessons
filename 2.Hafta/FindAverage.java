import java.util.Scanner;

public class FindAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Kac sayi girilecegini aliyoruz ayni zamanda ortalama alirken kullanacagiz.
        System.out.println("Gireceginiz sayilarin adetini giriniz : ");
        int count = scanner.nextInt();
        //Ortalamayi double olarak tanimladik cunku ortalama tam sayi olmayabilir.
        double average = 0;
        //for loopu i = 0 dan baslayip her adimda i yi bir artirarak ilerleyecek ve i counta esit oldugu zaman duracak.
        for (int i = 0; i < count; i++) {
            System.out.println(count - i + " sayi daha giriniz : ");
            average += scanner.nextInt(); //Girilen sayilari sakliyoruz.
        }
        System.out.println("Ortalama : " + average / count);
    }
}
