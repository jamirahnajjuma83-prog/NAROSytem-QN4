 import java.util.Random;

public class RainfallReport {

    public static void main(String[] args) {

        Random random = new Random();

        int[] rainfall = new int[30];

        int total = 0;
        int wetDays = 0;

        System.out.println("Daily Rainfall:");

        for (int i = 0; i < rainfall.length; i++) {

            rainfall[i] = random.nextInt(61);

            System.out.println("Day " + (i + 1) + ": " + rainfall[i] + " mm");

            total += rainfall[i];

            if (rainfall[i] > 30) {
                wetDays++;
            }
        }

        double average = (double) total / rainfall.length;
        
        System.out.println("\nTotal Rainfall = " + total + " mm");
        System.out.println("Average Rainfall = " + average + " mm");
        System.out.println("Wet Days = " + wetDays);

        if (total <= 300) {
            System.out.println("Month Classification: Dry");
        } else if (total < 600) {
            System.out.println("Month Classification: Normal");
        } else {
            System.out.println("Month Classification: Flood-risk");
        }
    }
}
    

