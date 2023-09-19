import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("All are equal.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Any of two are equal.");
        } else {
            System.out.println("None of the numbers are equal.");
        }
        sc.close();
    }
}