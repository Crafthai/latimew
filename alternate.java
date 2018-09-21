import java.util.Random;

public class alternate {

    public static void main(String[] args) {

        //all the variables
        Random r = new Random();
        int latiMew = 500000;
        int clicks = 5000;
        int highest = 0;
        int lowest = 10000;
        int fiveMil = 0;
        int oneK = 0;
        double total = 0;

        for (int i = 0; i < 100000; i++) {
            int success = 0;
            clicks = 0;

            //while loop to see how many clicks it took per attmept
            while (success != latiMew) {
                success = (r.nextInt(500000) + 1); //generates random number between 1-500000 to simulate a single click
                clicks++;
            }
            if (clicks > highest) {
                highest = clicks;
            } else if (clicks < lowest) {
                lowest = clicks;
            }
            if (clicks < 1000) {
                oneK++;
            } else if (clicks > 5000000) {
                fiveMil++;
            }
            total = total + clicks;
        }
        //prints relevant information
        System.out.println("highest number of clicks: " + highest +
                "\nlowest number of clicks: " + lowest +
                "\naverage number of clicks: " + (total / 100000) +
                "\namount of times succeeded in under 1000 clicks: " + oneK +
                "\namount of times succeeded in over 5 million clicks: " + fiveMil);
    }
}
