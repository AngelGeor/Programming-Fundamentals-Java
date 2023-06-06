package Arrays_lab;

import java.util.Scanner;

public class EvenAndOddSubstraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] arr = scanner.nextLine().split( " ");

        int[] numArr = new int[arr.length];
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);

        }
            int evenSum = 0;
            int oddSum = 0;
        for (int num: numArr ) {
            if (num % 2 == 0) {
                evenSum += num;
            }else {
                oddSum += num;
            }
        }

        int difference = evenSum - oddSum;

        System.out.println(difference);
    }
}