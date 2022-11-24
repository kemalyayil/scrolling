import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("0 ile 5 arasi numara gir = ");

        int number = scanner.nextInt();
        Random random = new Random();
        int bilgisayarSayisi = random.nextInt(5);

        System.out.println("Bilgisayar sayisi = " + bilgisayarSayisi);

        if (bilgisayarSayisi == number){
            System.out.println("Kazandin!!!");
        }else {
            System.out.println("Kaybettin");
        }

    }
}
