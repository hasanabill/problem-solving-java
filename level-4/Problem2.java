import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int product = num1 * num2;
        int sumOfResults = sum + product;
        int productOfResults = sum * product;
        System.out.println("Sum of the two numbers: " + sum);
        System.out.println("Product of the two numbers: " + product);
        System.out.println("Sum of results: " + sumOfResults);
        System.out.println("Product of results: " + productOfResults);
        sc.close();
    }
}