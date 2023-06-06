package Methods_Ex;

import java.util.Scanner;

public class AddSubtractNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());


        System.out.println(sum(number1,number2) - number3);

    }

    public static int sum(int numberOne, int numberTwo) {
        int sum = numberOne + numberTwo;
        return sum;
    }
}


