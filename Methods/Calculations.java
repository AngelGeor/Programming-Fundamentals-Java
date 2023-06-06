package Methods_Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());

        switch (input) {
            case "add":
                add(firstNumber, secondNumber);
                break;
            case "multiply":
                multiply(firstNumber,secondNumber);
                break;
            case "subtract":
                subtract(firstNumber, secondNumber);
                break;
            case "divide":
                divide(firstNumber,secondNumber);
                break;
        }

    }

    public static void add(double firstNum, double secondNum) {
        double result = firstNum + secondNum;
        System.out.printf("%.0f", result);
    }

    public static void multiply(double firstNum, double secondNum) {
        double result = firstNum * secondNum;
        System.out.printf("%.0f", result);
    }

    public static void subtract(double firstNum, double secondNum) {
        double result = firstNum - secondNum;
        System.out.printf("%.0f", result);
    }

    public static void divide(double firstNum, double secondNum) {
        double result = firstNum / secondNum;
        System.out.printf("%.0f", result);
    }
}