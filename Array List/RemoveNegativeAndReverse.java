package Lists_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numList.removeIf(n -> n < 0);

        Collections.reverse(numList);

        if (numList.isEmpty()) {
            System.out.println("empty");
        }else {
            System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
