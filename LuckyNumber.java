class LuckyNumber {
    public static void main(String[] args) {
        int num = 1623;   // you can change this number
        int temp = num;
        int rev = 0;

        // Reverse the number to make it easier to find even positions (left to right)
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        int pos = 1;  // position counter
        int sum = 0;

        while (rev > 0) {
            int digit = rev % 10;

            // if the digit is in even position
            if (pos % 2 == 0) {
                sum = sum + (digit * digit);
            }

            rev = rev / 10;
            pos++;
        }

        if (sum % 9 == 0)
            System.out.println(num + " is a Lucky Number");
        else
            System.out.println(num + " is not a Lucky Number");
    }
}
