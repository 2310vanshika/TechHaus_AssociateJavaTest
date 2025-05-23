package java_solutions;

public class Problem7 {

    public static double calculateInflation(double ratePercent, int years) {
        double rate = 1 + ratePercent / 100;
        return Math.round((Math.pow(rate, years) - 1) * 100);
    }

    public static void main(String[] args) {
        double inflation = calculateInflation(20, 5);  
        System.out.println((int) inflation + "%");    
    }
}
