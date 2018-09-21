import java.util.Random;

public class alternate {

    public static void main(String[] args) {

        //all the variables
        Random r = new Random();
        int latiMew = 500000;
        int clicks = 5000;
        int highest = 0;
        int lowest = 10000;
        double total = 0;

        for (int i = 0; i < 10000; i++) {
            int success = 0;
            clicks = 0;

            //while loop to see how many clicks it took per attmept
            while (success != latiMew) {
                success = (r.nextInt(500000) + 1); //generates random number between 1-500000 to simulate a single click
                clicks++;
            }
            if (clicks > highest) {
                highest = clicks;
            }
            if(clicks < lowest){
                lowest = clicks;
            }
            total = total + clicks;
        }
        //prints relevant information
        System.out.println("highest number of clicks: " + highest);
        System.out.println("lowest number of clicks: " + lowest);
        System.out.println("average number of clicks: " + (total / 10000));
    }
}
