package tests;

import java.lang.reflect.Method;

public class Question2_Test {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        try {
            Class<?> question2Class = Class.forName("Question2_SubsetSumCount");
            Method countMethod = question2Class.getMethod("countSubsetsThatSumToResult", int[].class, int.class);
            int result1 = (Integer) countMethod.invoke(null, array1, 10);
            System.out.println("Unique sums count (10): " + result1);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        int[] array2 = {1, 2, 4, 7, 5};
        try {
            Class<?> question2Class = Class.forName("Question2_SubsetSumCount");
            Method countMethod = question2Class.getMethod("countSubsetsThatSumToResult", int[].class, int.class);
            int result2 = (Integer) countMethod.invoke(null, array2, 17);
            System.out.println("Unique sums count (17): " + result2);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } 
    }
}