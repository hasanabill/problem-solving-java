import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + calculateProduct(num1, num2));
        scanner.close();
    }

    public static double calculateProduct(double a, double b) {
        return a * b;
    }
}