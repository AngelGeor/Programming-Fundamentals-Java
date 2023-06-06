package DataTypes_Ex;

import java.util.Scanner;

public class tripleLatinLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 'a'; i < number + 'a' ; i++) {
            for (int j = 'a'; j < number + 'a' ; j++) {
                for (int k = 'a'; k < number + 'a'; k++) {
                    System.out.printf("%c%c%c%n",i, j,k );
                }
            }
        }

    }
}
