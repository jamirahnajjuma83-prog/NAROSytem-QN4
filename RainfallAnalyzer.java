 public class RainfallAnalyzer {
    public static void main(String[] args) {
        int[] rainfall = {0, 15, 32, 45, 28, 0, 12};
        int total = 0;
        int dryDays = 0;
        
        for (int reading : rainfall) {
            total += reading;
            if (reading == 0) {
                dryDays++;
            }
        }
        
        System.out.println("Total: " + total + " mm");
        System.out.println("Average: " + (total / rainfall.length) + " mm");
        System.out.println("Dry days: " + dryDays);
    }
}
    

