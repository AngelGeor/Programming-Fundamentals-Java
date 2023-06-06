package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("Finish")){
        List<Integer> collapseList = new ArrayList<>(numList);
            String action = command[0];

            switch (action) {
                case "Add":
                    int numberToAdd = Integer.parseInt(command[1]);
                numList.add(numberToAdd);
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(command[1]);
                    numList.remove(Integer.valueOf(numberToRemove));
                    break;
                case "Replace":
                    int numberToReplace = Integer.parseInt(command[1]);
                    int replaceWith = Integer.parseInt(command[2]);

                    for (int i = 0; i < numList.size(); i++) {
                        int currentElement = numList.get(i);
                        if (currentElement == numberToReplace) {
                            numList.set(numList.indexOf(currentElement),replaceWith);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    int numberValue = Integer.parseInt(command[1]);

                    for (int i = 0; i < collapseList.size(); i++) {
                        int currentNumber = collapseList.get(i);
                        if (currentNumber < numberValue) {
                            numList.remove(Integer.valueOf(currentNumber));
                        }
                    }

                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }


        for (int number: numList) {
            System.out.print(number + " ");
        }

    }
}
