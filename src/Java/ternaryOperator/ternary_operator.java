package Java.ternaryOperator;
/*
Conditional operator in Java provides a one line approach for creating a simple conditional statement.

It is often used as a shorthand method for if-else statement. It makes the code much more simple, shorter and readable.

The conditional operator (?:) is also known as ternary operator in java because it takes three operands and perform
a conditional test.

The basic syntax to use conditional operator in java program is as follows:

                                        Syntax:

                                        variable = exp1 ? exp2 : exp3;
                                               where exp1, exp2, and exp3 are expressions.
 */
public class ternary_operator {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
        int z = (x > y) ? x : y;
        System.out.println("Greatest number: " +z);


    }
}
