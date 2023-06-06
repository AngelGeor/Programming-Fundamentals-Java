package Arrays_Ex;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = 1; //
        int maxLength = 0;
        int startingIndex = 0;
        int bestStartIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                length ++;

            }else {
                length = 1;
                startingIndex = i;

            }

            if (length > maxLength) {
                maxLength = length;
                bestStartIndex = startingIndex;
            }

        }

        for (int i = bestStartIndex; i < bestStartIndex + maxLength ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
