import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double l = sc.nextDouble();
        double area = Math.pow(l, 2);
        double perimeter = 4 * l;
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
        sc.close();
    }
}