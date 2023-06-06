package AssociativeArrays_Ex;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Istinski Materiali: shards, fragments, motes.
        Map<String, Integer> materialsMap = new TreeMap<>();
        materialsMap.put("shards", 0);
        materialsMap.put("fragments", 0);
        materialsMap.put("motes", 0);

        //junk -> the rest
        Map<String, Integer> junksMap = new TreeMap<>();
        boolean isOver = false;
        while (!isOver) {
            String input = scanner.nextLine().toLowerCase();
            String[] inputData = input.split("\\s+");

            for (int i = 0; i < inputData.length; i += 2) {
                int quantity = Integer.parseInt(inputData[i]);
                String materials = inputData[i + 1];

                if (materials.equals("shards") || materials.equals("fragments") || materials.equals("motes")) {
                    int currentQuantity = materialsMap.get(materials);
                    materialsMap.put(materials, currentQuantity + quantity);
                    if (materialsMap.get(materials) >= 250) {
                        if (materials.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (materials.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        materialsMap.put(materials, materialsMap.get(materials) - 250);
                        isOver = true;
                        break;
                    }
                } else {
                    if (!junksMap.containsKey(materials)) {
                        junksMap.put(materials, quantity);
                    } else {
                        int currentQuantity = junksMap.get(materials);
                        junksMap.put(materials, currentQuantity + quantity);
                    }
                }
            }
        }

        //Sortirane: Materiali
        materialsMap.entrySet().stream().sorted((entry1,entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        //Sortirane na Junk po alphabetical order:

        junksMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

    }
}
