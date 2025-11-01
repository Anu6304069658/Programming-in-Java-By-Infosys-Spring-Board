//Implement a program to display the sum of two given numbers if the numbers are same. If the numbers are not same, display the double of the sum.

import java.util.Scanner;

public class SelectionExample1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=s.nextInt();
        System.out.println("Enter a number:");
        int y=s.nextInt();
        if(x==y)
        {
            System.out.println(x+y);
        }
        else
        {
            System.out.println((x*2+y*2));
        }
        s.close();
    }
}
