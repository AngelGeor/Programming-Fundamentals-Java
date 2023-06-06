package Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (i == numbers.length - 1) {
                System.out.println(currentNumber + " ");
                continue;
            }
            boolean isBiggest = false;

            for (int j = i + 1 ; j <numbers.length ; j++) {
                 if (currentNumber > numbers[j]) {
                     isBiggest = true;
                 }else {
                     isBiggest = false;
                     break;
                 }
            }

            if (isBiggest) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
