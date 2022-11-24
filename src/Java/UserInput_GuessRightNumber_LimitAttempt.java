package Java;

import java.util.Random;
import java.util.Scanner;

public class UserInput_GuessRightNumber_LimitAttempt {
    public static void main(String[] args) {
        /*
        * kullanicidan 0 ile 10 arasinda bir sayi tahmin etmesini isteyin
        * kullanici sayiyi girince randon sayidan kucukse daha buyuk dusun,
        uyukse daha kucuk dusun diye uyarsin
        * kullanicinin 3 hakki olsun ve her hakki azaldikca kac hakk oldugunu yazsin
         */
    int sayac1=0;
    int sayacAzalan =3;

    Scanner sc = new Scanner(System.in);
    Random rastgele = new Random();
    int sayi = rastgele.nextInt(11);

        System.out.println("Lütfen 0-10 arasında bir sayı giriniz: ");
    int tahmin = sc.nextInt();
    sayac1++;


        while (tahmin != sayi) {

            if (sayacAzalan < 2){
                System.out.println("3 kere denedin olmadi, seni afaroz ettim, de get, koviyrim seni");
                break;
            }

        if(tahmin > 10 || tahmin < 0) {
            sayacAzalan--;
            System.out.println("Tahmininiz 1-10 arasında olmalıdır!!! " + sayacAzalan + " tane daha hakkiniz kaldi");
            System.out.println("-------------------- ");

            tahmin = sc.nextInt();
        }

        else if (tahmin < sayi) {
            sayacAzalan--;
            System.out.println("tahmininiz daha buyuk bir sayi olmalidir,tekrar deneyin, " + sayacAzalan + " tane daha hakkiniz kaldi" );
            System.out.println("---------------------------- ");
            tahmin = sc.nextInt();
            sayac1++;
        }
        else{
            sayacAzalan--;
            System.out.println("tahmininiz daha kucuk bir sayi olmalidir,tekrar deneyin, " + sayacAzalan + " tane daha hakkiniz kaldi");
            System.out.println("---------------------------- ");
            tahmin = sc.nextInt();
            sayac1++;
        }
        if(tahmin==sayi){
            System.out.println("Tebrikler " +sayac1+ " denemede sayiyi buldunuz");
        }
    }

        System.out.println("Random sayı:"+sayi);
        System.out.println("----------------------- ");
}
}
