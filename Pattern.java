public class Pattern {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {  // number of rows
            for (int j = 1; j <= i; j++) {  // print stars
                System.out.print("*");
            }
            System.out.println();  // move to next line
        }
    }
}
