package Methods_Lab;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            printLine(1, i);
        }

        for (int j = number - 1; j >= 1 ; j--) {
            printLine(1, j);
        }

    }
    public static void printLine (int start, int stop) {
        for (int i = start; i <=stop  ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
