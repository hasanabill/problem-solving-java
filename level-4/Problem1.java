import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int sum = num1 + num2;
        int product = num1 * num2;
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}