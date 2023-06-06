package Methods_Ex;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        printSmallestInt(numberOne,numberTwo,numberThree);

    }

    public static void printSmallestInt (int number1, int number2, int number3) {
        if (number1 <= number2 && number1 <= number3) {
            System.out.println(number1);
        }else if (number2 <= number1 && number2 <= number3) {
            System.out.println(number2);
        }
        else {
            System.out.println(number3);
        }
    }
}
