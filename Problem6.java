package java_solutions;

public class Problem6 {
    private static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1) count++;
        return count;
    }

    public static String stringWithMostVowels(String[] arr) {
        String result = "";
        int max = 0;
        for (String s : arr) {
            int count = countVowels(s);
            if (count > max) {
                max = count;
                result = s;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        System.out.println(stringWithMostVowels(arr));  
    }
}
