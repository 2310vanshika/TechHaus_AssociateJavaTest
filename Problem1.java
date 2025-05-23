package java_solutions;

public class Problem1 {
    public static int countNumberOfDigits(int num) {
        num = Math.abs(num);
        if (num == 0) {
        	return 1;
        }
        int count = 0;
        while (num > 0) {
            num = num/ 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOfDigits(34));     
        System.out.println(countNumberOfDigits(-7291));  
    }
}

