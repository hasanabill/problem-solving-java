public class Problem8 {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 5, 4, 5, 2, 8 };
        boolean isPalindrome = checkPalindrome(arr);
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}