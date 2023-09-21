import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        System.out.println("Circumference of the circle: " + calculateCircumference(radius));
        System.out.println("Area of the circle: " + calculateArea(radius));
        sc.close();
    }

    public static double calculateCircumference(double radius) {
        return 2 * 3.1416 * radius;
    }

    public static double calculateArea(double radius) {
        return 3.1416 * radius * radius;
    }
}