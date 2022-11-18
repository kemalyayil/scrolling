package Java;

public class arstrongSayiMi153 {
    public static void main(String[] args) {
        // 153 sayisinin kupleri = (1*1*1) + (5*5*5) + (3*3*3) = 153

        int sayi =153;
        int rakam;
        int toplam = 0;
        int sayininIlkHali = sayi;

        while (sayi > 0){
            rakam = sayi % 10;
            sayi = sayi /10;

            toplam+=(rakam*rakam*rakam);

        }
        if (sayininIlkHali == toplam){
            System.out.println("Evet, armstrong");
        }else{
            System.out.println("hayir");
        }

    }
}
