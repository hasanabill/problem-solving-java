import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();
        String concatenatedString = str1 + str2;
        System.out.println("Concatenated string: " + concatenatedString);
        sc.close();
    }
}