package Java;

public class PerfectNumber {
    // 6 sayisi kendisi haric 1,2,3 e tam bolunur ve toplami 6 ya esittir. bu perfect number olur

    public static void main(String[] args) {
        int sayi = 15;
        boolean sonuc = mukemmelSayiKontrol(sayi);
        System.out.println(sonuc);

    }
    public static boolean mukemmelSayiKontrol(int sayi){
       int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0){
                toplam += i;
                if (toplam == sayi){
                    return true;
                }
            }
        }
        return false;
//        boolean sonuc = toplam == sayi;
//        return  sonuc;
    }
}
