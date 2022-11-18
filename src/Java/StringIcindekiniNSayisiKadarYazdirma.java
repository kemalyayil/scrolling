package Java;

import java.util.Arrays;

public class StringIcindekiniNSayisiKadarYazdirma {
    public static void main(String[] args) {
        String ali = stringTimes("ali", 3);
        System.out.println(ali);
    }
    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;  // could use += here
        }
        return result;
    }
}
