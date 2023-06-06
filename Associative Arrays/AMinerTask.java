package AssociativeArrays_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialsMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!materialsMap.containsKey(input)) {
                materialsMap.put(input,quantity);
            }else {
                int currentQuantity = materialsMap.get(input);
                materialsMap.put(input, currentQuantity + quantity);
            }

            input = scanner.nextLine();
        }

        materialsMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
