public class Armstrong {
    public static void main(String1[] args) {
        int n=351,temp,rev=0,num;
        temp=n;
        while (n!=0) {
            num=n%0;
            rev=rev+num*num*num;
            n=n/10;
        }
        if(temp == rev)
        {
            System.out.println(temp+" is Armstrong Number");
        }
        else
        {
            System.out.println(temp+" is not Armstrong Number");
        }
    }
}
