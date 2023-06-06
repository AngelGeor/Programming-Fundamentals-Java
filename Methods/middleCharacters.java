package Methods_Ex;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleChars(text);

    }

    public static void printMiddleChars (String text) {
        if (text.length() % 2 != 0) {
           int textMiddleSymbol = text.length()/2;
            System.out.println(text.charAt(textMiddleSymbol));
        }else {
            int firstIndex = (text.length() - 1 ) /2;
            int secondIndex = (text.length() / 2);

            System.out.println(text.charAt(firstIndex) + "" + text.charAt(secondIndex));
        }

        }
    }

