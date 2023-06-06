package AssociativeArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .filter(e -> e.length() % 2 == 0)
                .toArray(String[]::new);

        for (String element: wordsArr) {
            System.out.println(element);
        }
    }
}
