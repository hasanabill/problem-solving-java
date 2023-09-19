import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of three subjects (out of 100): ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int totalMarks = s1 + s2 + s3;
        double percentageMarks = (totalMarks / 300.0) * 100.0;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + percentageMarks + "%");
        sc.close();
    }
}