package tests;

import java.util.List;
import java.lang.reflect.Method;

public class Question1_Test {
    public static void main(String[] args) {
        String[] strings = {"AABCDA", "ABCDZADC", "ABCDBCA", "ABCDABDCA"};
        List<Character> characters = List.of('A', 'B', 'C', 'D');
        try {
            Class<?> question1Class = Class.forName("Question1_GetLongestString");
            Method getLongestStringMethod = question1Class.getMethod("getLongestString", List.class, String[].class);
            String result = (String) getLongestStringMethod.invoke(null, characters, strings);
            System.out.println("Longest valid string: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}