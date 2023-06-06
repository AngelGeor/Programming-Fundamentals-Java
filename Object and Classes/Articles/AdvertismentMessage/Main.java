package ObjectAndClasses_Ex.Articles.AdvertismentMessage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        AdvertMessage message = new AdvertMessage();

        for (int i = 0; i < number; i++) {
        message.randomMessage();
        }
    }
}
