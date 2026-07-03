public class Forloop {
    public class ForLoopExample {
    public static void main(String[] args) {
        double[] rainfall = new double[30];

        for (int i = 0; i < 30; i++) {
            rainfall[i] = 20.5;
            System.out.println("Day " + (i + 1) + ": " + rainfall[i] + " mm");
        }
    }
}
    
}
