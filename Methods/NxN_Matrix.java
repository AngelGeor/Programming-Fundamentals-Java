package Methods_Ex;

import java.util.Scanner;

public class NxN_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {

            printLine(number);
        }

    }

    public static void printLine (int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
