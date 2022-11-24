import java.util.Random;
import java.util.Scanner;


/* java nin 1-20 arasinda rastgele bir sayi vermesini isteyin.
    -kullanicidan sayiyi tahmin etmesini isteyin
    -tahmininiz sayidan buyukse "tahmininiz daha kucuk bir sayi olmalidir,tekrar deneyin"
    -tahmininiz sayidan kucukse "tahmininiz daha buyuk bir sayi olmali,tekrar deneyin"
    -tahmin dogru olunca sayac yardimi ile kac deneme yapildigini ve
                                            "Tebrikler ..... denemede sayiyi buldunuz" yazdiralim.
     **Random() classini kullanabilirsiniz( Random class i kullanilirken 0 dan basliyor dikkat edelim)
     */
//http://ubeydullahdogan.com.tr/bloglar/javasayi-tahmin-oyunu
public class Game2_SayiTahminVeSayac {
    public static void main(String[] args) {
        int sayac1=0;
        int sayac2=0;

        Scanner sc = new Scanner(System.in);
        //Random metodumuzu oluşturuyoruz..

        Random rastgele = new Random();
        int sayi = rastgele.nextInt(21);
        //Üretilen sayıyı sayi değişkenimize atadık
        System.out.println("Lütfen 1-20 arasında bir sayı giriniz: ");
        int tahmin = sc.nextInt();
        // Kullcanıcı tarafından tahminini aldık..
        sayac1++;

        while (tahmin != sayi) {

            if(tahmin > 20 || tahmin < 0) {
                System.out.println("Tahmininiz 1-20 arasında olmalıdır!!!: ");
                System.out.println("-------------------- ");
                tahmin = sc.nextInt();
            }

            else if (tahmin < sayi) {
                System.out.println("tahmininiz daha buyuk bir sayi olmalidir,tekrar deneyin: ");
                System.out.println("---------------------------- ");
                tahmin = sc.nextInt();
                sayac1++;
            }
            else{
                System.out.println("tahmininiz daha kucuk bir sayi olmalidir,tekrar deneyin: ");
                System.out.println("---------------------------- ");
                tahmin = sc.nextInt();
                sayac2++;
            }
        }
        int tSayisi=sayac1+sayac2;
        System.out.println("Random sayı:"+sayi);
        System.out.println("Tebrikler " +tSayisi+ " denemede sayiyi buldunuz");
        System.out.println("----------------------- ");
    }
}
