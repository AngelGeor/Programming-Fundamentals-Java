package List_Exe;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!command.equals("end")) {

            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());

            String firstCommand = commandLine.get(0);
            int number = Integer.parseInt(commandLine.get(1));

            if (firstCommand.equals("Delete")) {
                numList.removeAll(List.of(number));
            }else if (firstCommand.equals("Insert")) {
                int position = Integer.parseInt(commandLine.get(2));
                numList.add(position,number);

            }

            command = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));

       // for (int number : numList ) {
        //    System.out.print(number + " ");
        //}

    }
}
