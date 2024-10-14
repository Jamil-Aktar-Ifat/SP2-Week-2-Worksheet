/**
 * Now that we can decode single digits, it’s time to build some code that will
 * help
 * detect errors in credit card numbers. Here’s the idea:
 * (a) Starting with the check digit and moving left, compute the sum of all the
 * decoded digits.
 * (b) Compute the remainder of the sum using integer division by 10. If the
 * result
 * is not zero, the credit card number is invalid. Otherwise, the card number is
 * likely to be valid.
 * Here are two examples:
 * Card number: 2315778
 * decode(8, false) = 8
 * decode(7, true) = 5
 * decode(7, false) = 7
 * decode(5, true) = 1
 * decode(1, false) = 1
 * decode(3, true) = 6
 * decode(2, false) = 2
 * Sum = 30
 * 30 mod 10 = 0
 * This number may be valid
 * Card number 1234567
 * decode(7, false) = 7
 * decode(6, true) = 3
 * decode(5, false) = 5
 * decode(4, true) = 8
 * decode(3, false) = 3
 * decode(2, true) = 4
 * decode(1, false) = 1
 * Sum = 31
 * 31 mod 10 = 1
 * This number is invalid
 * Write a static method called checkDigits that is passed a seven-digit credit
 * card number and that performs the steps described above. You should reuse the
 * decode method that you wrote in Question 3. The method should return the
 * word "valid" if the number passes the test and "invalid" otherwise.
 * You should test your methods with the following main method:
 * Page 3
 * public class Luhn2 {
 * public static void main(String[] args) {
 * int num = 2315778;
 * System.out.println("CC number: " + num + " is " + checkDigits(num));
 * num = 1234567;
 * System.out.println("CC number: " + num + " is " + checkDigits(num));
 * num = 7654321;
 * System.out.println("CC number: " + num + " is " + checkDigits(num));
 * num = 1111111;
 * System.out.println("CC number: " + num + " is " + checkDigits(num));
 * }
 * public static String checkDigits(int number) {
 * // Put your code here
 * return "";
 * }
 * }
 */


public class Problem_4 {

    public static void main(String[] args) {
        int num = 2315778;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1234567;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 7654321;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        num = 1111111;
        System.out.println("CC number: " + num + " is " + checkDigits(num));

    }
    /**
     *  Check the digits of the credit card number
     * @param number the credit card number
     * @return  the word "valid" if the number passes the test and "invalid" otherwise
     */

    static String checkDigits(int number) {
        int sum = 0;
        boolean even = false;
        for (int i = 0; i < 7; i++) {
            int digit = number % 10;
            number = number / 10;
            sum = sum + decode(digit, even);
            even = !even;
        }
        if (sum % 10 == 0) {
            return "valid";
        } else {
            return "invalid";
        }
    }

    /**
     *  Decodes a digit using the Luhn algorithm.
     * @param digit     the digit to decode
     * @param position  whether the digit is in an odd or even position
     * @return  the decoded digit
     */

    static int decode(int digit, boolean position) {
        if (!position) {
            return digit;
        } else {
            int doubled = digit * 2;

            if (doubled < 10) {
                return doubled;
            } else {
                return (doubled / 10) + (doubled % 10);
            }

        }

    }

    
}
