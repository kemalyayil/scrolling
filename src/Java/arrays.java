package Java;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int [] x = {1, 2, 2, 1, 13};  // array icindeki degerlerin toplamini bul
        int count= 0;

        int [] yeni;
        yeni = new int[]{1, 2, 3, 5};
        System.out.println(Arrays.toString(yeni));

        for (int i = 0; i < x.length; i++) {
            count = count + x[i];
        }

        System.out.println(count);
    }
}
