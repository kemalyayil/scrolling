package Java;

public class faktorielMethodlu {
    // Java ile faktöriyel hesaplama örneği aslında en temel örneklerden biridir.
    // Faktöriyel aslında bir sayının kendisinden önceki sayılar ile çarpımından elde edilir.
    // Örneğin;
    //          5! = 5x4x3x2x1 = 120
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
