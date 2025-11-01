//Selection Control Structure - Exercise 1
public class MaximumNumber {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int num3 = 1;

        int max;

        if(num1 >= num2 && num1 >= num3)
            max = num1;
        else if(num2 >= num1 && num2 >= num3)
            max = num2;
        else
            max = num3;

        System.out.println(max);
    }
}
