import java.util.Arrays;
import java.util.Random;

public class shuffleArray {
    public static void main(String[] args) {
        int array[] = {5,2,7,9,10};

        Random random = new Random();
        //random.nextInt(5); // dersek 5 dahil olmayan degerler getirir.
        for (int i = 0; i < array.length; i++) {
            int rastgele = random.nextInt(array.length);
            int rastgeleIndeztekiSayi = array[rastgele];
            array[rastgele] = array[i];
            array[i] = rastgeleIndeztekiSayi;
        }
        System.out.println(Arrays.toString(array));
    }
}
