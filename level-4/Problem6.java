import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        double square = number * number;
        System.out.println("Square of the number: " + square);
        sc.close();
    }
}