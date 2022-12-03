package Java.forEachLoop;

public class forEachLoop2_SumNumbersInArray {
    public static void main(String[] args) {
        // Declare an array of 10 elements.
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

// Iterating elements using for-each loop to display and sum the values.
        for(int x : nums) {
            sum += x;
//            System.out.println("Sum1: " + sum);       // buraya koyarsak satir satir islemleri tek tek yazdiriyor
        }
        System.out.println("Sum: " + sum);
    }
}
