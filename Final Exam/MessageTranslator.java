package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<command>[A-Z][a-z]{2,})!:(?<text>\\[[A-Za-z]{8,}\\])";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if(matcher.find()) {
                String command = matcher.group("command");
                String text = matcher.group("text");
                text = text.substring(1,text.length() -1);

                translateMessage(text, command);

            }else {
                    System.out.println("The message is invalid");
            }
        }


    }

    private static void translateMessage(String text, String command) {
        StringBuilder numbers = new StringBuilder();
        for (int symbol : text.toCharArray()){
            numbers.append(symbol).append(" ");

        }
        System.out.println(command + ": " + numbers);
    }
}
