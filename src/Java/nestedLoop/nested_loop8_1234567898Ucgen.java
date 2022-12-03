package Java.nestedLoop;
/*
      1
    2 3 4
  5 6 7 8 9
 */
public class nested_loop8_1234567898Ucgen {
    public static void main(String[] args) {
        int i, j, k = 1;

        for (i = 1; i <= 5; i += 2) {
            for (j = 5; j >= 1; j--) {
                if (j > i)
                    System.out.print(" ");
                else
                    System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
