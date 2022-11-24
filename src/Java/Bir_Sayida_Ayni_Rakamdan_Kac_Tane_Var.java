package Java;

public class Bir_Sayida_Ayni_Rakamdan_Kac_Tane_Var {
    // Oluşturacağınız program ile verilen sayının içerisindeki rakamlardan kaç tane olduğunu bulun.
    //sayi : 1349210515
    public static void main(String[] args) {
        int sayi = 1349210515;          // 10 basamakli

        int[] sonuc = adetler(sayi);
        for (int i = 0; i < 10; i++) {      // 10 u yazdik, cunku 0-9 arasinda 10 tane index var
            System.out.println(sayi + " sayısında " + sonuc[i] + " adet " + i + " var.");
        }
    }

    public static int[] adetler(int sayi) {

        int[] basamak = new int[10];
        while (sayi > 0) {
            int bas = sayi % 10;
            basamak[bas]++;
            sayi /= 10;
        }
        return basamak;

    }
}

