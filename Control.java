//Iteration Control Structure - Exercise 2
/*Implement a program to display the geometric sequence as given below for a given value n, where n is the number of elements in the sequence.

1, 2, 4, 8, 16, 32, 64, ......, 1024 */
public class Control {
    public static void main(String[] args) {
        int n = 5; 
        int term = 1; 
        
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term = term * 2; 
        }
    }
}
