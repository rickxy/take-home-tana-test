import java.util.*;

public class Question6_TopThreeWords {

    public static List<String> topThreeWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) return Collections.emptyList();

        String[] words = sentence.trim().split("\\s+");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
            (a, b) -> {
                int cmp = Integer.compare(b.getValue(), a.getValue());
                return cmp != 0 ? cmp : a.getKey().compareTo(b.getKey());
            }
        );

        pq.addAll(freqMap.entrySet());

        List<String> topThree = new ArrayList<>();
        int count = 0;
        while (!pq.isEmpty() && count < 3) {
            topThree.add(pq.poll().getKey());
            count++;
        }

        Collections.sort(topThree);
        return topThree;
    }

    public static void main(String[] args) {
        String input = "hi there care to discuss algorithm basis or how to solve algorithm or";
        List<String> result = topThreeWords(input);
        System.out.println("Top 3 words: " + result); 
    }
}
