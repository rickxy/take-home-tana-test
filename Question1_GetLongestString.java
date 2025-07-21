import java.util.*;

public class Question1_GetLongestString {

    public static String getLongestString(List<Character> characters, String[] strings) {
        Set<Character> validSet = new HashSet<>(characters);
        String longest = "";

        for (String s : strings) {
            if (isValid(s, validSet)) {
                if (s.length() > longest.length()) {
                    longest = s;
                }
            }
        }
        return longest;
    }

    private static boolean isValid(String s, Set<Character> validSet) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Condition 1
            if (!validSet.contains(c)) {
                return false;
            }

            // Condition 2
            if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Main
    public static void main(String[] args) {
        List<Character> validCharacters = Arrays.asList('A', 'B', 'C', 'D');
        String[] inputStrings = {
            "AABCDA",
            "ABCDZADC",
            "ABCDBCA",
            "ABCDABDCA"
        };

        String result = getLongestString(validCharacters, inputStrings);
        System.out.println("Longest valid string: " + result); 
    }
}
