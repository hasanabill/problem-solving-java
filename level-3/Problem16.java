import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        int digit1 = number / 100;
        int digit2 = (number / 10) % 10;
        int digit3 = number % 10;
        int reversedNumber = digit3 * 100 + digit2 * 10 + digit1;
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
        scanner.close();
    }
}