package Java;

public class primeNumbers {
    public static void main(String[] args) {
        boolean sonuc = asaliMi(2);

        if(sonuc)
            System.out.println("Asal");
        else
            System.out.println("Asal degil");

    }
    public static boolean asaliMi(int sayi){
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0){
                return false;
            }
        }
        return true;
    }
}
