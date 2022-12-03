package Java.nestedLoop;
/*
        A 
        A B 
        A B C 
        A B C D 
        A B C D E 
 */
public class nested_loop7_ABCDE {
    public static void main(String[] args) {
        for (int i = 65; i <= 69; i++) {
            for (int j = 65; j <= i; j++) {
                System.out.print((char)j + " ");    // 65. deger i char a cevirerek baslayip enson 69. degeri cevirdik
            }
            System.out.println(" ");
        }
    }
}
