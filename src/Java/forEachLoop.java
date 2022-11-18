package Java;

import java.util.Arrays;

public class forEachLoop {
    public static void main(String[] args) {

        int [] x = {1, 2, 2, 1};
        for(int number : x){
            System.out.println(number);             // array disinda gibi yazdirmak icin
        }
        System.out.println(Arrays.toString(x));     // array icindeki gibi yazdirmak icin
    }
}
