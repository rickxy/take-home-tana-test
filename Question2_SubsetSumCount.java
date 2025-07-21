import java.util.*;

public class Question2_SubsetSumCount {

    public static int countSubsetsThatSumToResult(int[] array, int target) {
        Set<String> uniqueCombinations = new HashSet<>();
        findSubsets(array, 0, target, new ArrayList<>(), uniqueCombinations);
        return uniqueCombinations.size();
    }

    private static void findSubsets(int[] array, int index, int target, List<Integer> current, Set<String> results) {
        if (target == 0) {
            List<Integer> sorted = new ArrayList<>(current);
            Collections.sort(sorted);
            results.add(sorted.toString());
            return;
        }

        if (target < 0 || index >= array.length) {
            return;
        }

        current.add(array[index]);
        findSubsets(array, index + 1, target - array[index], current, results);
        current.remove(current.size() - 1);

        findSubsets(array, index + 1, target, current, results);
    }

    // Main 
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int target1 = 10;
        System.out.println("Number of unique combinations: " + countSubsetsThatSumToResult(array1, target1));

        int[] array2 = {1, 2, 4, 7, 5};
        int target2 = 17;
        System.out.println("Number of unique combinations: " + countSubsetsThatSumToResult(array2, target2));
    }
}
