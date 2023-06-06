package DataTypes_Ex;

import java.util.Scanner;

public class dataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")) {

            if (input.equals("true") || input.equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.length() < 2) {
                if (input.charAt(0) < 48 || input.charAt(0) > 57) {
                    System.out.printf("%s is character type%n", input);
                }
            } else {
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(0) == 45 && input.charAt(1) != 45) {
                        if (input.charAt(i) < 48 || input.charAt(i) > 57) {
                            System.out.printf("%s is text type%n", input);
                            break;
                        }
                    }
                }
            }
            input = scanner.nextLine();

        }
    }
}