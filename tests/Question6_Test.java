package tests;

import java.lang.reflect.Method;
import java.util.List;

public class Question6_Test {
    public static void main(String[] args) {
        String input = "hi there care to discuss algorithm basis or how to solve algorithm or";
        try {
            Class<?> question6Class = Class.forName("Question6_TopThreeWords");
            Method topThreeWordsMethod = question6Class.getMethod("topThreeWords", String.class);
            @SuppressWarnings("unchecked")
            List<String> result = (List<String>) topThreeWordsMethod.invoke(null, input);
            System.out.println("Top 3 common words: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}