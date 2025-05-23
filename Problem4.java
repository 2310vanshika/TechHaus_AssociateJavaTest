package java_solutions;
import java.util.Arrays;

public class Problem4 {
    public static String medianOutput(double[] arr) {
        int n = arr.length;
        if (n == 0) return String.format("%-35s %-15s", "[]", "-");

        Arrays.sort(arr); 
        String arrayStr = Arrays.toString(arr).replace("[", "").replace("]", "");

        if (n % 2 == 1) {
            double median = arr[n / 2];
            return String.format("%-35s %-15.1f", arrayStr, median);
        } else {
            double mid1 = arr[n / 2 - 1];
            double mid2 = arr[n / 2];
            double median = (mid1 + mid2) / 2;
            return String.format("%-35s (%4.1f + %4.1f) / 2 = %.1f", arrayStr, mid1, mid2, median);
        }
    }

    public static void main(String[] args) {
        System.out.printf("%-35s %-30s\n", "Array", "Median");
        System.out.println(medianOutput(new double[]{10.7}));
        System.out.println(medianOutput(new double[]{1.0, 2.0, 3.0}));
        System.out.println(medianOutput(new double[]{17.4, 21.1, 39.7, 48.0}));
        System.out.println(medianOutput(new double[]{-957.0, -493.0, -384.0, -268.0, -131.0}));
    }
}
