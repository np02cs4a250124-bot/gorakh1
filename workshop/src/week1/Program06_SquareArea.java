package week1;
import java.util.Scanner;

public class Program06_SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of one side of the square: ");
        double side = scanner.nextDouble();

        double area = side * side;

        System.out.println("\nSide length: " + side);
        System.out.println("Area:        " + area);

        scanner.close();
    }
}
