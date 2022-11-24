package Java;

import java.util.Scanner;

public class faktorielMethodu3 {
    //Eğer kullanıcı çıkış yapmak isteyene kadar devam eden bir program oluşturmak istiyorsak
    // şu şekilde bir yapı oluşturabiliriz:
    //Eğer kullanıcı -1 girerse programın sonlanmasını isteyebiliriz.

    public static void main(String[] args) {
        int number = -1;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayı Girin: ");
            number = scan.nextInt();
            if (number != -1) {
                int result = 1;
                for (int i = 1; i <= number; i++) {
                    result = result * i;
                }
                System.out.println(number + "! = " + result);
            }
        } while (number != -1);
    }
}
