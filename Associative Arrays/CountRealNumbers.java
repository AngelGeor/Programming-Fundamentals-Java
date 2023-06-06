package AssociativeArrays_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> counterMap = new TreeMap<>();

        for (int i = 0; i < numList.size(); i++) {
            double currentNum = numList.get(i);
            if (counterMap.containsKey(currentNum)) {
                counterMap.put(currentNum, counterMap.get(currentNum) + 1);
            } else {
                counterMap.put(currentNum, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : counterMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }

    }

}
