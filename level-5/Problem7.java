import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int absoluteValue = Math.abs(number);
        System.out.println("Absolute value: " + absoluteValue);
        sc.close();
    }
}