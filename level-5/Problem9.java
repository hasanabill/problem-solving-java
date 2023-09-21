import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of classes held: ");
        int totalClasses = sc.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int attendedClasses = sc.nextInt();
        double attendancePercentage = (double) attendedClasses / totalClasses * 100.0;
        System.out.println("Percentage of classes attended: " + attendancePercentage + "%");

        if (attendancePercentage >= 75.0) {
            System.out.println("Allowed to sit in the exam.");
        } else {
            System.out.print("Do you have a medical cause? (Y/N): ");
            char medicalCause = sc.next().charAt(0);
            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("You are allowed to sit in the exam due to a medical cause.");
            } else {
                System.out.println("Not allowed to sit in the examm.");
            }
        }
        sc.close();
    }
}