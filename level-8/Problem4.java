import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] originalArray = new int[10];
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            originalArray[i] = sc.nextInt();
        }
        int[] reversedArray = new int[10];
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }
        System.out.print("\nOriginal Array: ");
        printArray(originalArray);
        System.out.print("Reversed Array: ");
        printArray(reversedArray);
        sc.close();
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
