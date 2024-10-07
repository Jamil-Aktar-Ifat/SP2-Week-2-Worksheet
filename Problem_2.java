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

        double lenght = 3.4;
        double width = 6.4;
        double result = areaOfRectangle(lenght, width);

        System.out.println("Length: " + lenght + "\nWidth: " + width + " \nArea of rectangle: " + result);

    }

    static double areaOfRectangle(double lenght, double width) {
        return lenght * width;
    }

}
