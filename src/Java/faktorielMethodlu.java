package Java;

public class faktorielMethodlu {
    public static void main(String[] args) {
        System.out.println(factoriyel(6));

    }

    public static int factoriyel(int i){
        if(i == 1)
            return 1;
        else
            return (i * factoriyel(i-1));
    }
}
