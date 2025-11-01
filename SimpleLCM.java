import java.util.Scanner;

public class SimpleLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int lcm = (num1 > num2) ? num1 : num2; // start from the larger number

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                break; // LCM found
            }
            lcm++;
        }

        System.out.println("LCM of " + num1 + " and " + num2 + " = " + lcm);
        sc.close();
    }
}
