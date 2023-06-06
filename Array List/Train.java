package List_Exe;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfWagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();


        while (!input.equals("end")) {

            List<String> inputArray = Arrays.stream(input.split(" ")).collect(Collectors.toList());
            String command = inputArray.get(0);


            if (command.equals("Add")) {
                int numberOfPassengers = Integer.parseInt(inputArray.get(1));
                listOfWagons.add(numberOfPassengers);
            }else {
                int passengersToAdd = Integer.parseInt(inputArray.get(0));

                for (int i = 0; i < listOfWagons.size(); i++) {
                    int currentNumber = listOfWagons.get(i);

                    if (currentNumber + passengersToAdd <= maxCapacity) {
                        listOfWagons.set(i,currentNumber + passengersToAdd);
                        break;
                    }
                }

            }


            input = scanner.nextLine();
        }

        for (int wagons : listOfWagons) {
            System.out.print(wagons + " ");
        }
    }
}