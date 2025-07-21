package tests;

import java.lang.reflect.Method;

public class Question3_Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            Class<?> question3Class = Class.forName("Question3_DecrementPossible");
            Method canMakeZerosMethod = question3Class.getMethod("canMakeZeros", int[].class);
            int result = (Integer) canMakeZerosMethod.invoke(null, (Object) array);
            System.out.println("Can make zeros? " + result); 
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}