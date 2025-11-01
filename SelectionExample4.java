/*Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.

A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:



Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the final bill amount to be paid by a customer.

The below information must be used to check the validity of the data provided by the customer: 

Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.

Distance in kms must be greater than 0.

Quantity ordered should be minimum 1.

If any of the input is invalid, the bill amount should be displayed as -1.*/

import java.util.Scanner;

public class SelectionExample4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char foodType = s.next().charAt(0);
        int qty = s.nextInt();
        int dist = s.nextInt();
        int cost = 0;
        if ((foodType != 'V' && foodType != 'N') || qty < 1 || dist <= 0) {
            System.out.println(-1);
        } else {
            if (foodType == 'V') {
                cost = 12 * qty;
            } else {
                cost = 15 * qty;
            }
        }
        int delivery = 0;
        if (dist > 3 && dist <= 6) {
            delivery = (dist - 3) * 1;
        } else if (dist > 6) {
            delivery = (3 * 1) + (dist - 6) * 2;
        }
        System.out.println(cost + delivery);
        s.close();
    }

}
