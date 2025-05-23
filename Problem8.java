package java_solutions;

public class Problem8 {

    public static String convertTime(int totalSeconds) {
        int days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);
        int hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        return days + " Day(s) " + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)";
    }

    public static void main(String[] args) {
        System.out.println(convertTime(21893872));  
    }
}
