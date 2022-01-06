public class reverseTheString1 {
    public static void main(String[] args) {
        String str = "Cengiz";

        char[] letters = str.toCharArray();

        String yeni = "";
        for (int i = str.length()-1; i>=0 ; i--){
            yeni = yeni + letters[i];
        }
        System.out.println(yeni);
    }

}
