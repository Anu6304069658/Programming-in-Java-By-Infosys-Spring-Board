//Methods - Assignment 3
class Sum
{
    int num;
public int sumOfDigits()
{
    int sum=0,d;
    while(num!=0)
    {
        d=num%10;
        sum=sum+d;
        num=num/10;
    }
    return sum;
   
}
}
public class Method3 {
    public static void main(String1[] args) {
        Sum s= new Sum();
        s.num=123;
        int total=s.sumOfDigits();
        System.out.println(total);
    }
}
