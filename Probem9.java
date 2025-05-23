package java_solutions;

public class Probem9 {
    public static boolean isSpecial(int num) {
        if (num < 10 || num > 99) return false;
        int a = num / 10;
        int b = num % 10;
        return num == a + b + (a * b);
    }

    public static void main(String[] args) {
        System.out.println(isSpecial(59)); 
        System.out.println(isSpecial(34));  
    }
}
