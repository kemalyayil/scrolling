public class StringIcerisindeSayilariToplamaCikarma {
    // String icerisindeki cift sayilari topla, tek sayilari cikar.
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        String number = "6611";     // all digits will be sum.

        for (int i = 0; i < number.length(); i++) {
            String numDigits = ""+number.charAt(i);
            int b =  Integer.parseInt(numDigits);
            if(b % 2 == 0){
                even = even + b;      // all digits will be sum.
            }
            if(b % 2 != 0){
                odd = odd + b;      // all digits will be sum.
            }

        }

        System.out.println(even - odd);
    }
}
