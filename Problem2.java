package java_solutions;

public class Problem2 {

    public static double calculateGrossPrice(double netPrice, double taxRate) {
        return Math.round((netPrice / (1 + taxRate)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        double[][] data = {
            {99.95, 0.12},
            {49999.00, 0.28},
            {720.00, 0.05},
            {45.00, 0.00}
        };

        System.out.printf("%-15s %-10s %-15s\n", "Net Price", "Tax Rate", "Gross Price");
        for (double[] row : data) {
            double net = row[0];
            double tax = row[1];
            double gross = calculateGrossPrice(net, tax);
            System.out.printf("%-15.2f %-10.2f %-15.2f\n", net, tax, gross);
        }
    }
}
