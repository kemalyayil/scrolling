package Java;

import java.util.Random;
/*
/Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların ortalamasını alacak
programı geliştirin. Programı yazarken aşağıdaki özelliklere uygun yazınız.//

Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin.
Sabit elemanlı bir dizi vermeyin!
 */

/*
3 ile 10 arasında rastgele sayı (3 ve 10 dahil) almak istiyoruz: 10-3+1 = 8

Random rastgele = new Random();
int rastgeleSayi = rastgele.nextInt(8) + 3;  // line 25 e ek olarak
 */
public class randomClass_100_sayi_secVeToplami_Ortalamasi {
    public static void main(String[] args) {
        int [] dizi = new int[10]; // 100 adet istendigi icin value 100 girdik.

        double randomSayiToplam = 0; // double data kullandik, cunku ortalama alirken kusuratli cikacak
        for (int i = 0; i < 10; i++) {
            Random rastgele = new Random();
            int sayi = rastgele.nextInt(10); // parantez icine deger girersek(10 vb), 0 ila girdigimiz deger arasinda sayi uretir
            dizi[i]= sayi;
            System.out.print(sayi + " || ");
        }

        System.out.println(" ");
        System.out.println("uretilen rastele sayi adeti =  " + dizi.length);


        for (int j = 0; j < dizi.length; j++) {
            randomSayiToplam = randomSayiToplam + dizi[j];
        }


        double randomSayiOrtalama = randomSayiToplam / dizi.length;
        System.out.println("randomSayiToplam = " + randomSayiToplam);
        System.out.println(" ");
        System.out.println("randomSayiOrtalama = " + randomSayiOrtalama);

    }
}

