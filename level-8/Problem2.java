import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter a number to check: ");
        int numToCheck = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] == numToCheck) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(numToCheck + " is present in the array.");
        } else {
            System.out.println(numToCheck + " is not present in the array.");
        }
        sc.close();
    }
}