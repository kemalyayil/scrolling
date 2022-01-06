import java.lang.reflect.Array;

public class faktoriel {
    public static void main(String[] args) {
        int faktoriel=1;

        int sayi = 6;
        for (int i = 1; i < sayi; i++) {
//            faktoriel = i * faktoriel;
            faktoriel *= i;
        }
        System.out.println(faktoriel);

    }
}
