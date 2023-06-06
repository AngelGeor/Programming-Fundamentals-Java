package Methods_Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(input,n));
    }

    public static String repeatString(String textToRepeat, int number) {
        String output = "";
        for (int i = 0; i < number; i++) {
            output += textToRepeat;
        }
        return output;
    }
}
