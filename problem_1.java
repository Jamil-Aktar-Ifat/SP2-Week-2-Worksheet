/**
 * Run the following code. The sum method in this program violates a design
 * princi-
 * ple (that methods should not try to modify an argument) when it assigns 5 to
 * a,
 * and 6 to b. The values have changed; this can be seen by examining the value
 * the
 * sum method returns. What about arguments x and y? Are their values changed,
 * too? In other words: Do the assignments made in the method body have side ef-
 * fects in the main program?
 * public class Sum {
 * public static void main(String[] args) {
 * int x = 2;
 * int y = 3;
 * System.out.println("x: " + x + " y: " + y + " Sum: " + sum(x, y));
 * }
 * // /**
 * // * Computes the sum of two arguments.
 * // *
 * // * @param a an int operand to be added
 * // * @param b another int operand
 * // * @return the sum of a and b
 * //
 */
// public static int sum(int a, int b) {
// a = 5;
// b = 6;
// return a + b;
// }
// }

public class problem_1 {

    public static void main(String[] args) {

        int result = addition(4, 4);
        System.out.println("The result is "+result);

    }

    static int addition(int a, int b) {
        return (a + b);
    }
}