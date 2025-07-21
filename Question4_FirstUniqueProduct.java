import java.util.*;

public class Question4_FirstUniqueProduct {

    public static String firstUniqueProduct(String[] products) {
        Map<String, Integer> countMap = new LinkedHashMap<>();

        for (String product : products) {
            countMap.put(product, countMap.getOrDefault(product, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; 
    }

    public static void main(String[] args) {
        String[] products1 = {"Apple", "Computer", "Apple", "Bag"};
        System.out.println("First unique product: " + firstUniqueProduct(products1)); 

        String[] products2 = {"Pen", "Pen", "Book", "Book"};
        System.out.println("First unique product: " + firstUniqueProduct(products2)); 
    }
}
