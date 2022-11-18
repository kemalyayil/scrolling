package Java;
//Given a string, return a version where all the "x" have been removed.
// Except an "x" at the very start or end should not be removed.

//stringX("xxHxix") → "xHix"
//stringX("abxxxcd") → "abcd"
//stringX("xabxxxcdx") → "xabcdx"

public class stringX_IlkVeSonKarakterHaricXleriDegistir {

    public static void main(String[] args) {
        String y = stringX("xxHxix");
        System.out.println(y);
    }

    public static String stringX(String str) {
        if(str.length()<3){
            return str;
        }
        char first = str.charAt(0);
        char last  = str.charAt(str.length()-1);

        String rest = str.substring(1,str.length()-1).replaceAll("x","");

        return first + rest + last;
    }


}
