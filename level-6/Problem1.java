import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter 10 integer: ");
        for (int i = 1; i <= 10; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        double average = sum / 10;
        System.out.println("Average value: " + average);
        sc.close();
    }
}