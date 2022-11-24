package Java;

public class _100deKacTane13eBolunenVar {
    public static void main(String[] args) {

        String str2 = thirteen(139);
        System.out.println("str2 = " + str2);

    }
    public static String thirteen(int num){
        String str = "";
        for (int i = num; i > 0; i--) {
            if (i % 13 == 0) {
                str = str + i + " ";

            }
//                System.out.print(i + " ");  ==> method void ise bu olabillir.
        }
        return str;
    }
}