package AssociativeArrays_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();

        // produkt -> obshta cena (Broi * edinichna cena)

        Map<String, Double> productsAndPrice = new LinkedHashMap<>();
        Map<String, Integer> productsAndQuantity = new LinkedHashMap<>();
        while (!input.equals("buy")) {
            String product = input.split("\\s+")[0];
            double singlePrice = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            productsAndPrice.put(product,singlePrice);

            if (!productsAndQuantity.containsKey(product)){
                productsAndQuantity.put(product,quantity);
            }else {
                productsAndQuantity.put(product, productsAndQuantity.get(product) + quantity);
            }


            input = scanner.nextLine();
        }

        for(Map.Entry<String, Double> entry : productsAndPrice.entrySet()) {
            String productName = entry.getKey();
            double totalSum = entry.getValue() * productsAndQuantity.get(productName);
            System.out.printf("%s -> %.2f%n", productName, totalSum);
        }
    }
}
