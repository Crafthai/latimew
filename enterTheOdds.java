import java.util.*;

public class enterTheOdds {

    public static void main(String[] args) {

        //all the variables
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int clicks = 5000;
        int highest = 0;
        int lowest = 10000;
        int lowestAttempt = 0;
        int highestAttempt = 0;
        int attempts = 0;
        double total = 0;

        System.out.println("1 out of how many?");
        int thePoke = scan.nextInt();
        System.out.println("how many tries?");
        int theAttempts = scan.nextInt();

        for (int i = 0; i < theAttempts; i++) {
            int success = 0;
            clicks = 0;

            //while loop to see how many clicks it took per attmept
            while (success != thePoke) {
                success = (r.nextInt(thePoke) + 1); //generates random number between 1-500000 to simulate a single click
                clicks++;
            }
            if (clicks > highest) {
                highest = clicks;
                highestAttempt = attempts;
            } else if (clicks < lowest) {
                lowest = clicks;
                lowestAttempt = attempts;
            }
            attempts++;
            total = total + clicks;
        }
        //prints relevant information
        System.out.println("highest number of clicks: " + highest +
                "\nwhich was at attempt #: " + highestAttempt +
                "\n" +
                "\nlowest number of clicks: " + lowest +
                "\nwhich was at attempt #: " + lowestAttempt +
                "\n" +
                "\naverage number of clicks: " + (total / theAttempts));
    }
}
