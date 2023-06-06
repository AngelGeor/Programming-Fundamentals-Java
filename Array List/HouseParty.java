package List_Exe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGuests = Integer.parseInt(scanner.nextLine());

        List <String> GuestNames = new ArrayList<>();
        for (int i = 0; i < numberOfGuests ; i++) {
            String command = scanner.nextLine();

            List <String> inputArr = Arrays.
                    stream(command.split(" "))
                    .collect(Collectors.toList());

            String name = inputArr.get(0);

            if (inputArr.size() == 3) { //Going
                if (GuestNames.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    GuestNames.add(name);
                }
            }else if (inputArr.size() == 4) { //Not going
                if (GuestNames.contains(name)) {
                    GuestNames.remove(name);

                }else {
                    System.out.printf("%s is not in the list!%n",name);
                }
            }

        }
        for (String names : GuestNames) {
            System.out.println(names);
        }
    }
}
