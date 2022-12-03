package Java.forEachLoop;

public class forEachLoop3_ArrayIcindeVarMiYokMu {
    public static void main(String[] args) {
        int nums[] = { 1, 8, 3, 7, 5, 6, 10, 4 };
        int val = 10;                   // aradigimiz deger
        boolean found = false;

// Searching element value 10 from an array using for each loop.
        for(int x : nums) {
            if(x == val) {
                found = true;
                break;          // bunun amaci, aranani bulunca programi sonlandirmak
            }
        }
        if(found)
            System.out.println("Value found!");
        else
            System.out.println("Not found");
    }
}
