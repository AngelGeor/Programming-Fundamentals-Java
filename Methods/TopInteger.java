package Methods_Ex;

import java.util.Scanner;

public class TopInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {

            if (iSSumDigitsDivisible(i) && holdsOddDigit(i)) {
                System.out.println(i);
            }
        }


    }
    public static boolean iSSumDigitsDivisible (int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum % 8 == 0;
    }

    public static boolean holdsOddDigit (int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }
}
