package Java;

import java.util.*;

public class Array_List_Aciklamalar_Metotlari {
    /*
ArrayList aracılığı ile sınırsız bir liste oluşturabilir ve istediğimiz kadar veriyi
bu listeye ekleyebiliriz. Ekledikçe genişleyen bir yapısı vardır.

                                    ArrayList Metotları
add(değer) : Listenin en sonuna yeni bir değer eklemek için kullanılır.

add(indis, değer) : Belirlenen indis (index) noktasına yeni bir değer eklemek için kullanılır.
                    Eklendiği yerden sonraki değerler kaydırılır.

addAll(list)        : Başka bir listeyi düzenlenen listenin sonuna ekler.

addAll(indis, list) : Başka bir listeyi belirlenen indis (index) değerinden itibaren ekler ve
                    sonrasında kalan değerleri kaydırır.

clear()             : Listedeki tüm elemanları temizler.

contains(değer)     : Girilen değer listede var ise TRUE, yoksa FALSE döndürür.

containsAll(list)   : Parametre olarak girilen listedeki değerler, ana listede var ise TRUE,
                      yoksa FALSE döndürür.

equals(list)        : Tüm liste elemanları parametre olarak alınan liste ile aynı ise TRUE,
                      yoksa FALSE döndürür.

indexOf(değer)      : Listede bulunan bir değerin indis (index) değerini döndürür.
                      (Değer birden çok tekrar ediyorsa ilk baştakini döndürür.)

lastIndexOf(değer)  : Listede bulunan bir değerin indis (index) değerini döndürür. (Değer birden çok tekrar ediyorsa en sondakini döndürür.)

get(indis)          : Listede girilen indis (index)'in tuttuğu değeri döndürür.

remove(indis)       : Girilen indis (index) değerindeki veriyi siler ve listeyi tekrar düzenler (Eğer oradan bir veri silinmiş ise listeyi geri kaydırır.)

remove(değer)       : Listede girilen değeri arar, var ise siler.

removeAll(list)     : Parametre olarak girilen listedeki değerleri ana listede arar ve var ise siler.

set(indis, değer)   : Listede var olan bir indis (index) değerine yeni bir veri atar.

size()              : Listenin toplam eleman sayısını döndürür.

subList(başlangıç, bitiş) : Listenin belli indis (index) değerleri arasındakileri döndürür.

toArray()           : ArrayList'i bir array'e döndürür.

toString()          : Listedeki elemanları "[5, 7, 10, 2]" şeklinde çıktı verir.
     */
    public static void main(String[] args) {
        // ArrayList Oluşturmak
        ArrayList sayilar = new ArrayList();

        // ArrayList ile Metotların Kullanımları
        sayilar.add("10");  // Listeye 10 sayısını ekler.
        sayilar.get(0);     // Listenin 0. elemanını (ilk elemanını) döndürür: 10
        sayilar.size();     // Listenin eleman sayısını döndürür: 1

        // ArrayList Tüm Elemanlarını Yazdırmak
        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i));
        }

    }



}
