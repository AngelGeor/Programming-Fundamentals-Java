package ObjectAndClasses_Ex.Articles.Article2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        List<Article2> articles = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            String[] articleInfo = scanner.nextLine().split(", ");
            String title = articleInfo[0];
            String content = articleInfo[1];
            String author = articleInfo[2];
            Article2 article = new Article2(title,content,author);
            articles.add(article);
        }

        String commandType = scanner.nextLine();
        switch (commandType) {
            case "title":
                articles.sort(Comparator.comparing(Article2::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article2::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article2::getAuthor));
        }

        for (Article2 article:articles) {
            System.out.println(article);
        }
    }
}
