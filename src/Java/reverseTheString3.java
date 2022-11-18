package Java;

public class reverseTheString3 {
    public static void main(String[] args) {
        String name = "Haydar";
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println(reversed);
    }
}
