package DataTypes_Ex;

import java.util.Scanner;

public class sumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < numberOfLines; i++) {
            char symbol = scanner.nextLine().charAt(0);
            sum = sum + (int)symbol;

        }
        System.out.printf("The sum equals: %d", sum);;
    }
}
