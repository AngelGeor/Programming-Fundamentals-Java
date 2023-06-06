package Methods_Ex;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long numberOne = Integer.parseInt(scanner.nextLine());
        long numberTwo = Integer.parseInt(scanner.nextLine());


        double result = 1.0 * factorial(numberOne) / factorial(numberTwo);
        System.out.printf("%.2f", result);

    }

    public static long factorial (long number) {
        long fact = 1;
        for (long i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}


