package Java;

public class aliAbi {
    public static void main(String[] args) {
        System.out.println("ali abi, how are you?");
        String myStr = "ali";
        int myStrLength = myStr.length();
        System.out.println(myStr.charAt(0));
        System.out.println(myStr.charAt(myStrLength-1));

        String t = "dombili";
        String tx = t + t;
        System.out.println("tx = " + tx);

        String stringDeger = "Merhaba mobilhanem.com";
        String[] stringDegerler = stringDeger.split(" ");
        System.out.println(stringDegerler[0]);
        System.out.println(stringDegerler[1]);

        for(int i = 0; i<3; i++) {
            System.out.println("i: " + i);
            for(int j=3; j>0; j--) {
                System.out.println("i: " + i + " j: " + j);
            }
        }


    }
}
