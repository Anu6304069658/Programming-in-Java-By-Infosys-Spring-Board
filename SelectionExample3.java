//Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

//Note: Only one of the three values can be 7.
import java.util.*;
public class SelectionExample3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a value:");
        int a=s.nextInt();
        System.out.println("Enter b value:");
        int b=s.nextInt();
        System.out.println("Enter c value:");
        int c=s.nextInt();
        if(a==7){
            System.out.println(b*c);
        }
        else  if(b==7)
        {
            System.out.println(c);
        }
        else if(c==7)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(a*b*c);
        }
        s.close();
    }
}
