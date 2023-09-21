import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("\nEntered numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        sc.close();
    }
}