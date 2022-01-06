import java.util.HashMap;

public class KacKelimeKullanilmis {
    public static void main(String[] args) {
        String metin = "Hamza Yilmaz ile Ahmet Yilmaz babalari Huseyin Yilmaz ile bulustu.";
        // hamza = 2, yilmaz = 1 , bugun = 2 , vs...
        String[] parcala = metin.split(" ");

        HashMap<String, Integer> kelimeler = new HashMap<>();

        for (int i = 0; i < parcala.length; i++) {
            String kelime = parcala[i];
            if (kelimeler.containsKey(kelime)) {
                int sayi = kelimeler.get(kelime);
                kelimeler.put(kelime, sayi + 1);
            } else {
                kelimeler.put(kelime, 1);
            }
        }

        System.out.println(kelimeler);
    }
}
