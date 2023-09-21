import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.print("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Sum of all elements: " + calculateSum(array));
        System.out.println("Product of all elements: " + calculateProduct(array));
        sc.close();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }

    public static long calculateProduct(int[] arr) {
        long product = 1;
        for (int num : arr)
            product *= num;
        return product;
    }
}