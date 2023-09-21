import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of 3 person: ");
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();
        int oldest = Math.max(age1, Math.max(age2, age3));
        int youngest = Math.min(age1, Math.min(age2, age3));
        System.out.println("Oldest person's age: " + oldest);
        System.out.println("Youngest person's age: " + youngest);
        sc.close();
    }
}