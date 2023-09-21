public class Problem11 {
    public static void main(String[] args) {
        int[] array = { 10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60 };
        int maxDifference = Integer.MIN_VALUE;
        int minDifference = Integer.MAX_VALUE;
        int maxDiffStart = 0, maxDiffEnd = 0;
        int minDiffStart = 0, minDiffEnd = 0;
        for (int i = 0; i < 11 - 1; i++) {
            for (int j = i + 1; j < 11; j++) {
                int diff = Math.abs(array[i] - array[j]);
                if (diff > maxDifference) {
                    maxDifference = diff;
                    maxDiffStart = i;
                    maxDiffEnd = j;
                }
                if (diff < minDifference) {
                    minDifference = diff;
                    minDiffStart = i;
                    minDiffEnd = j;
                }
            }
        }
        System.out.println("Subarray with maximum difference:");
        printSubarray(array, maxDiffStart, maxDiffEnd);
        System.out.println("Maximum difference: " + maxDifference);
        System.out.println("Subarray with minimum difference:");
        printSubarray(array, minDiffStart, minDiffEnd);
        System.out.println("Minimum difference: " + minDifference);
    }

    public static void printSubarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}