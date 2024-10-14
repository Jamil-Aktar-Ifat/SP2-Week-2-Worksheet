public class Problem_3 {
    public static void main(String[] args) {
        boolean even = false;
        System.out.println(decode(1, even));
        System.out.println(decode(2, even));
        System.out.println(decode(3, even));
        System.out.println(decode(4, even));
        System.out.println(decode(5, even));
        System.out.println(decode(6, even));
        System.out.println(decode(7, even));
        System.out.println(decode(8, even));
        System.out.println(decode(9, even));
        even = !even;
        System.out.println(decode(1, even));
        System.out.println(decode(2, even));
        System.out.println(decode(3, even));
        System.out.println(decode(4, even));
        System.out.println(decode(5, even));
        System.out.println(decode(6, even));
        System.out.println(decode(7, even));
        System.out.println(decode(8, even));
        System.out.println(decode(9, even));
    }


    /**
     * Decodes a digit using the Luhn algorithm.
     * @param digit the digit to decode
     * @param position  whether the digit is in an odd or even position
     * @return  the decoded digit
     */

     
    public static int decode(int digit, boolean position) {
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
