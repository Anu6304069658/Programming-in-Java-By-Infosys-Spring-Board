//Iteration Control Structure - Assignment 2
public class IterationEx2 {
    public static void main(String[] args) {
        int heads=150;
        int legs=500;
        boolean found = false;
        for (int chickens = 0; chickens <= heads; chickens++) {
            int rabbits = heads - chickens; // remaining heads are rabbits
            int totalLegs = (chickens * 2) + (rabbits * 4);

            if (totalLegs == legs) {
                System.out.println("Number of Chickens = " + chickens);
                System.out.println("Number of Rabbits = " + rabbits);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid input: Cannot determine valid number of chickens and rabbits.");
        }
    }
}
