package RegularExpressions_Ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> furniture = new ArrayList<>(); //Suhranqvame imenata na mebelite
        double totalSum = 0; //Obshtata izharchena suma

        //>>Sofa<<312.23!3 -> shablon za validen vhod

        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";

                 // ili >>(?<furnitureName>\w+)<<(?<price>\d+.?\d*)!(?<quantity>\d+)
        Pattern pattern = Pattern.compile(regex);


        while(!input.equals("Purchase"))  {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furniture.add(furnitureName);
                totalSum += price * quantity;
            }


            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String word : furniture) {
            System.out.println(word);
        }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
