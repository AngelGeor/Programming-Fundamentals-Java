package Methods_Ex;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);

        PrintInRange(firstChar, secondChar);
    }

    public static void PrintInRange(char firstSymbol, char secondSymbol) {

        if (firstSymbol < secondSymbol) {

            for (char i = (char) (firstSymbol + 1); i < secondSymbol; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char j = (char) (secondSymbol + 1); j < firstSymbol; j++) {
                System.out.print(j + " ");
            }

        }
    }
}