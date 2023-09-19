import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 50 && a < b) {
            System.out.println("Both conditions are true.");
        } else {
            System.out.println("At least one condition is false.");
        }
        sc.close();
    }
}