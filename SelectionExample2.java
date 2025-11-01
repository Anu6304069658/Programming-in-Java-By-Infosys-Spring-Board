/*Quadratic equation is an equation with degree 2 in the form of ax2 +bx + c = 0 where a, b and c are the coefficients.
Implement a program to solve a quadratic equation.

Find the discriminant value using the formula given below.

discriminant = b2 - 4ac

If the discriminant is 0, the values of both the roots will be same. Display the value of the root.

If the discriminant is greater than 0, the roots will be unequal real roots. Display the values of both the roots.

If the discriminant is less than 0, there will be no real roots. Display the message "The equation has no real root"

Use the formula given below to find the roots of a quadratic equation.

x = (-b ± discriminant)/2a */

import java.util.Scanner;

public class SelectionExample2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value:");
        double a=s.nextDouble();
        System.out.println("Enter b value:");
        double b=s.nextDouble();
        System.out.println("Enter c value:");
        double c=s.nextDouble();
        double d=b*b-4*a*c;
        if(d==0)
        {
            double r1=-b/(2*a);
            System.out.println("Root are same: " + r1);
        }
        else if(d>0)
        {
            double root1 = (-b + Math.sqrt(d)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("The roots are Unequal");
            System.out.println("Root1: " + root1);
            System.out.println("Root2: " + root2);
        }
        else {
            System.out.println("The equation has no real root");
        }
        s.close();
    }
}
