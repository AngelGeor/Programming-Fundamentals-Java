package Arrays_lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] firstArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int [] SecondArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = Math.max(firstArr.length, SecondArr.length);
        int sum = 0;
        boolean notIdentical = false;
        for (int i = 0; i < maxLength; i++) {
            sum += firstArr[i];

            if (firstArr[i] != SecondArr[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                notIdentical = true;
                break;
            }

        }
        if (!notIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
