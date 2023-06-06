package AssociativeArrays_Ex;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> charsCount = new LinkedHashMap<>();
        String text = scanner.nextLine();

        for (char symbol: text.toCharArray()) {
            if (symbol == ' '){
                continue;
            }
            if (!charsCount.containsKey(symbol)){
                charsCount.put(symbol,1);
            }else {
                int currentCount = charsCount.get(symbol);
                charsCount.put(symbol, currentCount + 1);
            }
        }
        charsCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));


    }
}
