package Java.ternaryOperator;

import java.util.Scanner;

public class ternary_operator2_String_VotingEligable {
    public static void main(String[] args) {
        // Create a Scanner class to accept input from the user.
        Scanner sc = new Scanner(System.in);

        // Prompt the user to input age for voting.
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        String str = "You are eligible to vote";
        String str2 = "You are not eligible to vote";

        String eligible = (age >= 18) ? str : str2;
        System.out.println(eligible);
    }
}
