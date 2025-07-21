import java.util.List;

public class Question1_Test {
    public static void main(String[] args) {
        String[] strings = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"};
        List<Character> characters = List.of('A', 'B', 'C', 'D');
        String result = Question1_GetLongestString.getLongestString(characters, strings);
        System.out.println("Longest valid string: " + result); // Expected: ABCDABDCA
    }
} 