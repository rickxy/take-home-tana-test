package tests;

import java.lang.reflect.Method;

public class Question4_Test {
    public static void main(String[] args) {
        String[] products = {"Apple", "Computer", "Apple", "Bag"};
        try {
            Class<?> question4Class = Class.forName("Question4_FirstUniqueProduct");
            Method firstUniqueProductMethod = question4Class.getMethod("firstUniqueProduct", String[].class);
            String result = (String) firstUniqueProductMethod.invoke(null, (Object) products);
            System.out.println("First unique product: " + result);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } 
    }
}