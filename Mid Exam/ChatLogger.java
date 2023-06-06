package MidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChatLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> chatList = new ArrayList<>();

        String[] command = scanner.nextLine().split("\\s+");
        List<String> spamList = new ArrayList<>();

        while (!command[0].equals("end")) {

            String action = command[0];

            switch (action) {
                case "Chat":
                    String inputWord = command[1];
                    chatList.add(inputWord);
                    break;
                case "Delete":
                    String wordToDelete = command[1];
                    chatList.remove(wordToDelete);
                    break;
                case "Edit":
                    String messageToReplace = command[1];
                    String newMessage = command[2];
                    for (int i = 0; i < chatList.size(); i++) {
                        String currentText = chatList.get(i);
                        if (currentText.equals(messageToReplace)) {
                            chatList.set(i,newMessage);
                        }
                    }
                    break;
                case "Pin":
                    String messageToPin = command[1];
                    for (int i = 0; i < chatList.size(); i++) {
                        String currentText = chatList.get(i);
                        if (currentText.equals(messageToPin)) {
                            chatList.add(messageToPin);
                            chatList.remove(currentText);

                        }
                    }
                    break;
                case "Spam":
                    spamList = Arrays.asList(command);
                    for (int i = 1; i < spamList.size(); i++) {
                        String currentText = spamList.get(i);
                        chatList.add(currentText);
                    }
                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }
        for (String element: chatList) {
            System.out.println(element);
        }
    }
}
