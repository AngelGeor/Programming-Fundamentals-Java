package Arrays_lab;

import java.util.Scanner;

public class sumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");
        int[] numArr = new int[items.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(items[i]);
        }
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                sum += numArr[i];
            }
        }
        System.out.println(sum);
    }
}
