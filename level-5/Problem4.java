import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter your years of service: ");
        int yearsOfService = sc.nextInt();
        double bonus = 0.0;
        if (yearsOfService > 5) {
            bonus = 0.05 * salary;
        }
        System.out.println("Net bonus amount: " + bonus);
        sc.close();
    }
}