package Methods_Lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        if (input.equals("coffee")) {
        result(1.50,quantity);
        }else if (input.equals("water")) {
            result(1.0, quantity);
        }else if (input.equals("coke")) {
            result(1.40, quantity);
        }else if (input.equals("snacks")) {
            result(2.0, quantity);
        }
    }
    public static void result(double price, int quantity) {
        double result = price * quantity;
        System.out.printf("%.2f", result);
    }

}
