import java.util.Scanner;

public class ahmetOdev {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        for(int i=3; i<=100; i++){
            int sayi = 3;
            int sonuc= sayi*i ;
            System.out.println(sayi + " * "+ i + "=" + sonuc);
        }
        System.out.println();
    }
}
