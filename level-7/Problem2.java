import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        sc.close();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}