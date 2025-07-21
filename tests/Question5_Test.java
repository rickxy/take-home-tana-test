package tests;

import java.lang.reflect.Method;

public class Question5_Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 4, 5, 2};
        try {
            Class<?> question5Class = Class.forName("Question5_ClosestMinimumDistance");
            Method closestMinDistanceMethod = question5Class.getMethod("closestMinDistance", int[].class);
            int result = (Integer) closestMinDistanceMethod.invoke(null, (Object) array);
            System.out.println("Distance between closest minimums: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}