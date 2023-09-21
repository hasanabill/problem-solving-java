import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double sum = calculateSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
        sc.close();
    }

    public static double calculateSum(double a, double b) {
        return a + b;
    }
}