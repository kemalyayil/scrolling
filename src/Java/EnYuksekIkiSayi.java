package Java;

import java.util.Arrays;

public class EnYuksekIkiSayi {
    public static void main(String[] args) {
        int[] array = {2,7,10,50,15,1};
        Arrays.sort(array);
        System.out.println(array[array.length-1]);
        System.out.println(array[array.length-2]);

        int enYuksekSayi = 0;
        int enYuksekSayi2 = 0;

        for (int i : array) {
            if (i>enYuksekSayi){
                enYuksekSayi2 =enYuksekSayi;        //
                enYuksekSayi = i;

            }else if(i>enYuksekSayi2){
                enYuksekSayi2 = i;
            }
        }
        System.out.println(enYuksekSayi);
        System.out.println(enYuksekSayi2);
    }
}
