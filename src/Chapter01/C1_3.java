package Chapter01;

/**
 * Finds the area and the perimeter of a rectangle
 *
 * @author Zakarea Yoosuf
 */
public class C1_3 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        double length = 7.9;
        double width = 4.5;
        double area = length * width;
        double perimeter = 2 * length + 2 * width;
        System.out.printf("Area: ");
        System.out.println(area);
        System.out.printf("Perimeter: ");
        System.out.println(perimeter);
    }
}
