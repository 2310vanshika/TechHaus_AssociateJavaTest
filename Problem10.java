package java_solutions;
import java.util.*;

public class Problem10 {
	 public static int secondLargest(int[] arr) {
        if (arr.length < 2) return Integer.MIN_VALUE;

        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{12, 35, 1, 10, 34, 1}));  
    }
}
