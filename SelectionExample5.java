/*The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account holders, i.e., customers.

Implement a program to determine the eligible loan amount and the EMI that the bank can provide to its customers based on their salary and the loan type they expect to avail.

The values required for determining the eligible loan amount and the EMI are:

account number of the customer

account balance of the customer

salary of the customer

loan type 

expected loan amount

expected no. of EMIs

The following validations should be performed:

The account number should be of 4 digits and its first digit should be 1

The customer should have a minimum balance of $1000 in the account

Display appropriate error messages if the validations fail.

If the validations pass, determine whether the bank would provide the loan or not. 

The bank would provide the loan, only if the loan amount and the number of EMIs expected by the customer is less than or equal to the loan amount and the number of EMIs decided by the bank respectively. The bank decides the eligible loan amount and the number of EMIs based on the below table. */

import java.util.Scanner;

public class SelectionExample5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int accNo = sc.nextInt();
        int salary = sc.nextInt();
        int balance = sc.nextInt();
        String loanType = sc.next();
        int expLoan = sc.nextInt();
        int expEmi = sc.nextInt();

        // Validation: account number must be 4 digits and start with 1
        if (accNo < 1000 || accNo > 9999 || accNo / 1000 != 1) {
            System.out.println("-1");
           
        }

        // Validation: minimum balance
        if (balance < 1000) {
            System.out.println("-1");
           
        }

        int eligibleLoan = 0;
        int eligibleEmis = 0;

        if (salary >= 75000 && loanType.equalsIgnoreCase("house")) {
            eligibleLoan = 7500000;
            eligibleEmis = 84;
        } else if (salary >= 50000 && loanType.equalsIgnoreCase("business")) {
            eligibleLoan = 6000000;
            eligibleEmis = 60;
        } else if (salary >= 25000 && loanType.equalsIgnoreCase("car")) {
            eligibleLoan = 500000;
            eligibleEmis = 36;
        } else {
            System.out.println("-1");
          }

        // Output only eligible loan and emis
        if (expLoan <= eligibleLoan && expEmi <= eligibleEmis) {
        System.out.println("eligibleloanamount=" + eligibleLoan);
        System.out.println("eliglibleemis=" + eligibleEmis);
        }

        sc.close();
    }
}
