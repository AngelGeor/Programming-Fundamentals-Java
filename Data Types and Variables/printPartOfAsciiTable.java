package DataTypes_Ex;

import java.util.Scanner;

public class printPartOfAsciiTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int symbol = start;  symbol <=end ; symbol++) {

            System.out.print((char)symbol + " ");
        }
    }
}
