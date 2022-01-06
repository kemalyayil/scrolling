import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class distinctKarekteriBul {
    public static void main(String[] args) {
        String ifade = "yiililllmmmmmmmaaaaazzz";
        String bos = "";

        Set<Character>liste = new LinkedHashSet<>();
        for (int i = 0; i < ifade.length(); i++) {
            liste.add(ifade.charAt(i));
        }
        System.out.println(liste);


//        String ifade = "yiililllmmmmmmmaaaaazzz";
//        String bos = "";
//        for (int i = 0; i < ifade.length(); i++) {
//            String harf = String.valueOf(ifade.charAt(i));
//            if (!bos.contains(harf)){
//                bos += harf;
//            }
//        }
//        System.out.println(bos);
    }
}
