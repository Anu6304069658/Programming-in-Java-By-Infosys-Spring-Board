import java.util.Scanner;

public class SeedNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number (X):");
        int x = s.nextInt();

        System.out.println("Enter the second number (Y):");
        int y = s.nextInt();

        int temp = x;
        int product = x;

        // Multiply x with each of its digits
        while (temp > 0) {
            int digit = temp % 10;
            product = product * digit;
            temp = temp / 10;
        }

        // Check if product equals y
        if (product == y) {
            System.out.println(x + " is a seed of " + y);
        } else {
            System.out.println(x + " is not a seed of " + y);
        }

        s.close();
    }
}
