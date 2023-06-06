package TextProcessing_Ex;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        StringBuilder sb = new StringBuilder();

        if(input == null || input.length() == 0){
            return;
        }
        char previousChar = input.charAt(0);
        sb.append(previousChar);

        for (int i = 0; i < input.length() ; i++) {
            char ch = input.charAt(i);
            if(ch != previousChar) {
                sb.append(ch);
                previousChar = ch;
            }
        }

        System.out.println(sb);
    }
}
