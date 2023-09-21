import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int count = 0;
        while (true) {
            System.out.print("Enter an integer (or 'q' to quit): ");
            String input = sc.next();
            if (input.equals("q")) {
                break;
            }
            int number = Integer.parseInt(input);
            sum += number;
            product *= number;
            count++;
        }
        if (count == 0) {
            System.out.println("No valid numbers entered.");
        } else {
            double average = (double) sum / count;
            System.out.println("Average of entered numbers: " + average);
            System.out.println("Product of entered numbers: " + product);
        }
        sc.close();
    }
}