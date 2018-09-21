import java.util.*;

public class Main {

    public static void main(String[] args) {

        //all the variables
        Random r = new Random();
        int latiMew = 500000;
        int attempts = 0;
        int clicks = 0;
        int highest = 0;
        double total = 0;

        //do while loop to determine how many attempts it took to get under 1000 clicks
        do {
            int success = 0;
            clicks = 0;

            //while loop to see how many clicks it took per attmept
            while (success != latiMew) {
                success = (r.nextInt(500000) + 1); //generates random number between 1-500000 to simulate a single click
                clicks++;
            }
            System.out.println("num clicks: " + clicks);
            if(clicks > highest){
                highest = clicks;
            }
            total = total + clicks;

            attempts++;
        } while(clicks > 1000);

        //prints relevant information
        System.out.println("num atttemps: " + attempts);
        System.out.println("highest number of clicks: " + highest);
        System.out.println("average number of clicks: " + (total/attempts));
    }
}
