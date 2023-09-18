public class six {
    public static void main(String[] args) {
        char txt = 'd';
        int ascii = (int) txt;
        int mod = ascii + 3;
        char modTxt = (char) mod;
        System.out.println("Modified character after adding 3: " + modTxt);
    }
}