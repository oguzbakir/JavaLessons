import java.util.Scanner;

public class SayMyName {

    public static void main(String[] args) {

        Scanner scnaner = new Scanner(System.in);

        String myName = "Heisenberg";

        int life = 3;
        String guess;
        System.out.println("Say my name!");
		/*hak 0 olmadigi surece donguye devam et. Burada life != 0 always true warningi gorebilirsiniz. Derste bunu fark etmemistim
		 * ama bu warningin sebebi life 0 a esit olunca zaten break ile donguden cikiyoruz dolayisiyle life 0 a esit oldugu zaman while
		 * icindeki ifade kontrol edilmeyecek. */
        while (life != 0) {
            System.out.println("Bir tahmin giriniz: ");
            guess = scnaner.nextLine();
			// Tahmin dogruysa oyunu bitir
            if(guess.equalsIgnoreCase(myName)) {
                System.out.println("You're goddamn right!");
                break;
            }
			// Tahmin yanlissa hakki bir azalt, 0 a esitse oyunu bitir.
            else {
                life--;
                if (life == 0) {
                    System.out.println("I'm the Heisenberg!");
                    break;
                }
                System.out.println("Daha iyi dusun " + life + " hakkin kaldi!");
            }
        }
    }
}
