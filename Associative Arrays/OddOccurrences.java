package AssociativeArrays_Lab;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Map<String, Integer> wordsCountMap = new LinkedHashMap<>();

        for (String words: wordsList) {
            String wordToLower = words.toLowerCase();

            if (wordsCountMap.containsKey(wordToLower)) {
                int currentCount = wordsCountMap.get(wordToLower);
                wordsCountMap.put(wordToLower,currentCount + 1);
            }else {
                wordsCountMap.put(wordToLower,1);
            }
        }

        List<String> oddWordsCount = new ArrayList<>();

        for(Map.Entry<String,Integer> entry: wordsCountMap.entrySet()) {
            int count = entry.getValue();
            if (count % 2 != 0) {
                oddWordsCount.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", oddWordsCount));
    }
}