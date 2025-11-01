//Selection Control Structure - Assignment 6
import java.util.Scanner;

public class ExactChange {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number of $5 notes:");
        int x = s.nextInt();

        System.out.println("Enter number of $1 notes:");
        int y = s.nextInt();

        System.out.println("Enter purchase amount:");
        int z = s.nextInt();

        int fiveNotes = Math.min(z / 5, x);  // use as many $5 notes as possible
        int remaining = z - (fiveNotes * 5); // remaining amount after using $5 notes

        if (remaining <= y) { // if we have enough $1 notes to cover remaining
            System.out.println("Number of $5 notes used: " + fiveNotes);
            System.out.println("Number of $1 notes used: " + remaining);
        } else {
            System.out.println("-1"); // exact change not possible
        }

        s.close();
    }
}
