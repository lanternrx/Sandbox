
import java.util.List;
import java.util.stream.Collectors;

public class Sandbox {
    public static void main(String[] args) {
        isPalindrome("racecar");
        isPalindrome("testa");
    }

    public static String reverse(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static Double average(List<Integer> list) {
        return (Double) list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }

    public static List<String> upperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static String fizzBuzz(Integer i) {
        StringBuilder sb = new StringBuilder();

        if (i % 3 == 0) {
            sb.append("Fizz");
        }

        if (i % 5 == 0) {
            sb.append("Buzz");
        }

        if (sb.length() != 0) {
            return sb.toString();
        }

        return i.toString();
    }

    public static boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(word.charAt(i));
        }

        if (word.equals(sb.toString())) {
            return true;
        }
        return false;
    }
}