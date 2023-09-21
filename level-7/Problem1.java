import java.util.Scanner;

public class Problem1 {
    public static double findMax(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return b;
        }
    }

    public static double findMin(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.println("Maximum number among the three: " + findMax(num1, num2, num3));
        System.out.println("Minimum number among the three: " + findMin(num1, num2, num3));
        sc.close();
    }
}