public class Test {
    public static void main(String[] args) {
        int numRows = 4;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("1");
                if (j < numRows - i - 1) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
