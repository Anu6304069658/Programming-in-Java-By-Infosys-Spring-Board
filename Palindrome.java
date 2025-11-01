public class Palindrome {
    public static void main(String[] args) {
        int n=1331,temp,rev=0,num;
        temp=n;
        while (n!=0) {
            num=n%10;
            rev=rev*10+num;
            n=n/10;
        }
        if (temp == rev) {
            System.out.println(temp +" is Palindrome Number");
        }
        else
        {
            System.out.println(temp +" is not Palindrome Number");
        }
        
    }
}
