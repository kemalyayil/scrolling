package Java;

import java.util.HashMap;

public class KacKelimeKullanilmis {
    public static void main(String[] args) {
//        String metin = "Hamza Yilmaz ile Ahmet Yilmaz babalari Huseyin Yilmaz ile bulustu.";
        String metin = "Spor Toto Süper Lig'in ilk haftasında sahasında Kasımpaşa'yı konuk eden Medipol Başakşehir'de teknik direktör Emre Belözoğlu, UEFA Avrupa Konferans Ligi 3. eleme turunda İzlanda temsilcisi Breidablik ile oynanan karşılaşmaya göre ilk 11'inde 6 değişiklik yaptı.";
        // hamza = 2, yilmaz = 1 , bugun = 2 , vs...
        String[] parcala = metin.split(" ");   // burda bosluk olmasaydi, bos karakter ve harflerin kac adet kullanildinigi gorecektik

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
