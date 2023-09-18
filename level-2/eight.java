public class eight {
    public static void main(String[] args) {
        double n = 3.9;
        double sq = Math.pow(n, 2);
        String x = String.format("%.2f", sq);
        System.out.println("The square of " + n + " is: " + x);
    }
}