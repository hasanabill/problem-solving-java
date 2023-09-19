import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        double area = length * breadth;
        int areaAsInteger = (int) area;
        System.out.println("Area of the rectangle: " + areaAsInteger);
        sc.close();
    }
}