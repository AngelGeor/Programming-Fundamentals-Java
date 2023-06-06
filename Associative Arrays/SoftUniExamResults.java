package AssociativeArrays_Ex;

import com.sun.jdi.event.ClassUnloadEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Map 1: Username , Points
        Map<String, Integer> userPoints = new HashMap<>();
        //Map 2: language, number of submissions
        Map<String,Integer> languageCount = new HashMap<>();

        String input = scanner.nextLine();

        while(!input.equals("exam finished")) {
            String[] splitArray = input.split("-");

            //1. "{username}-{language}-{points}"
            //2. "{username}-banned"
            String userName = splitArray[0];
            if (splitArray.length == 3) {
                String language = splitArray[1];
                int points = Integer.parseInt(splitArray[2]);
                //dobavqme username i tochki

                if (!userPoints.containsKey(userName)) {
                    userPoints.put(userName, points);
                } else {
                    int currentPoints = userPoints.get(userName);
                    if(points > currentPoints) {
                        userPoints.put(userName,points);
                    }

                }
                // dobavqme broi sreshtaniq na ezika
                if (!languageCount.containsKey(language)) {
                    languageCount.put(language,1);
                }else {
                    languageCount.put(language,languageCount.get(language) + 1);
                }

            }else {
              userPoints.remove(userName);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoints.entrySet().stream()
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));

        System.out.println("Submissions:");
        languageCount.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));

    }
}
