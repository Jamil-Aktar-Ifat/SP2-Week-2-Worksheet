/**
 * Write a static method called areaOfRectangle that is passed two
 * floating-point
 * values for the length and width of a rectangle. The method returns the
 * product of the length and width as a double.
 * Comment the method using javadoc conventions (see also the comments for the
 * sum method in the code for Question 1). Write a main method that creates the
 * following variables to describe the sides of a rectangle:
 * double length = 3.4;
 * double width = 8.4;
 * The main method should print the length, width, and area of the rectangle.
 */

public class Problem_2 {

    public static void main(String[] args) {

        // variables describe the side of the rectangle
        double length = 3.4;
        double width = 6.4;

        // calculate the area
        double result = areaOfRectangle(length, width);

        // Printing the Length, Width, and Area
        System.out.println("Length: " + length + "\nWidth: " + width + " \nArea of rectangle: " + result);

    }


    /**
     * computes the area of ractangle
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @return returning the area as double 
     * @author Jamil
     */
    static double areaOfRectangle(double length, double width) {
        return length * width;
    }

}
