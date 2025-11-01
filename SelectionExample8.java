//Selection Control Structure - Assignment 8
import java.util.Scanner;

public class ZipZapZoom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = s.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Zoom");
        } else if (num % 3 == 0) {
            System.out.println("Zip");
        } else if (num % 5 == 0) {
            System.out.println("Zap");
        } else {
            System.out.println("Invalid");
        }

        s.close();
    }
}
