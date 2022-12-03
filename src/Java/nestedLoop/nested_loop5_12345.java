package Java.nestedLoop;
/*
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5
 */
public class nested_loop5_12345 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");  // buraya j koyarsan 1,2,3,4,5 sirali yazdiriliyor. 1, 2 2 , 3 3 3 ...seklinde deil
            }
            System.out.println(" ");
            k++;
        }
        // k++; buraya yazarsak hepsi 1 cikiyor.
    }
}
