package ObjectAndClasses_Ex.Articles.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] articleParts = scanner.nextLine().split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];

        Article article = new Article(title,content,author);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfCommands; i++) {
            String[] command = scanner.nextLine().split(": ");
            String commandName = command[0];
            String newValue = command[1];

            switch (commandName){
                case "Edit":
                    article.setContent(newValue);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(newValue);
                    break;
                case "Rename":
                    article.setTitle(newValue);
                    break;
            }

        }
        System.out.println(article);
    }
}
