package week1;
import java.util.Scanner;

public class Program05_RectanglePerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle:  ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);

        System.out.println("\nLength:    " + length);
        System.out.println("Width:     " + width);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }
}
