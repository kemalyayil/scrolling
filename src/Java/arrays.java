package Java;

import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int [] x = {1, 2, 2, 1, 13};  // array icindeki degerlerin toplamini bul
        int count= 0;


        int [] yeni= new int [4];
        System.out.println(Arrays.toString(yeni));
        yeni[0]= 1;

        for (int i = 0; i < x.length; i++) {
            count = count + x[i];
        }

        System.out.println(count);
    }
}
