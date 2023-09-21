import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int greatest;
        if (a > b) {
            greatest = a;
        } else {
            greatest = b;
        }
        System.out.println("The greatest number is: " + greatest);
        sc.close();
    }
}