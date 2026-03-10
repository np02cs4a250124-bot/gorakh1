package week1;
import java.util.Scanner;

public class Program11_MilesToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in miles: ");
        double miles = scanner.nextDouble();

        double kilometers = miles * 1.60934;

        System.out.println("\nMiles:      " + miles + " mi");
        System.out.println("Kilometers: " + kilometers + " km");

        scanner.close();
    }
}
