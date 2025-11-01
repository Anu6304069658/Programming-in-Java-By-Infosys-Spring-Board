//Iteration Control Structure - Assignment 3
import java.util.Scanner;

public class DivisibleBySumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = s.nextInt();
        int temp = num;
        int sum = 0;

        // find sum of digits
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        // check divisibility
        if (num % sum == 0) {
            System.out.println(num + " is divisible by the sum of its digits");
        } else {
            System.out.println(num + " is not divisible by the sum of its digits");
        }

        s.close();
    }
}
