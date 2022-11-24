package Java;

import java.util.Random;

public class RandomClassInstructions {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int rastgeleSayi = rastgele.nextInt(100); // 0-99 arası sayıları çeker.


        //Eğer rastgele sayı alırken 0'dan değilde 1'den başlamasını ve 100 sayısının
        // da dahil edilmesini istiyorsak;
        Random rastgele2 = new Random();
        int rastgeleSayi2 = rastgele.nextInt(100)+1; // 1 den baslamasi icin +1 koyuyoruz sona


        // 3 ile 10 arasında rastgele sayı (3 ve 10 dahil) almak istiyoruz: 10-3+1 = 8
        Random rastgele3 = new Random();
        int rastgeleSayi3 = rastgele.nextInt(8) + 3;


        // 100 ile 110 arasında rastgele sayı (100 ve 110 dahil) almak istiyoruz: 110-100+1 = 11
        Random rastgele4 = new Random();
        int rastgeleSayi4 = rastgele.nextInt(11) + 100;

        // nextDouble(), 0 ile 1 aralığında rastgele bir sayı seçer. Örneğin rastgele not ortalaması
        // hesaplaması için şöyle bir kod parçası oluşturabiliriz;
        Random rNot = new Random();
        double not = rNot.nextDouble() * 2.5 + 1.5;
        System.out.println("GPA: "+not);

        // Rastgele atılan 2 zarın toplamı 9 olmalıdır. Kaçıncı atışta 9 sayısına ulaşıldığını kullanıcıya
        // gösterin. Ayrıca her atışın toplamını ekrana çıktı olarak verin.
        Random rZar = new Random();
        int toplam = 0;
        int denemeSayisi = 0;

        while(toplam != 9) {
            int zar1 = rZar.nextInt(6) + 1;
            int zar2 = rZar.nextInt(6) + 1;
            toplam = zar1+zar2;
            denemeSayisi++;
            System.out.println(denemeSayisi+". deneme toplamı: "+toplam);
        }
        System.out.println(denemeSayisi+". denemede buldu!");
        //cikti sout
//        1. deneme toplamı: 8
//        2. deneme toplamı: 12
//        3. deneme toplamı: 7
//        4. deneme toplamı: 11
//        5. deneme toplamı: 9
//        5. denemede buldu!


    }
}
