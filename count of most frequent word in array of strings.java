import java.util.*;

public class MostFrequentWord {
    public static void main(String[] args) {
        String sentence = "this is a test this is only a test";

        // Convert to lowercase and split words
        String[] words = sentence.toLowerCase().split(" ");

        // HashMap to store word frequency
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // Find most frequent word
        String maxWord = "";
        int maxCount = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > maxCount) {
                maxCount = map.get(word);
                maxWord = word;
            }
        }

        System.out.println("Most frequent word: " + maxWord);
        System.out.println("Frequency: " + maxCount);
    }
}
