package List_Exe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //1. Vzimam pyrvata karta ot rukata
        //2. premahvam kartata ot rukata
        //3. Proverka koi pecheli

        //1. Ako karta na Purviq > karta na Vtoriq -> slagame nakraq na kartata na purviq -> Karta 1, karta 2.
        //2. ako Karta na vtoriq > kartata na purviq -> slagame nakraq na vtoriq karta nomer 2, karta nomer 1.
        //3. Ako dvete karti sa ravni , mahame dvete karti i ne gi dobavqme nikude.
        while (firstPlayer.size() > 0 && secondPlayer.size() > 0) {

            int firstPlayerCard = firstPlayer.get(0);
            int secondPlayerCard = secondPlayer.get(0);

            firstPlayer.remove(0);
            secondPlayer.remove(0);

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayer.add(firstPlayerCard);
                firstPlayer.add(secondPlayerCard);
            }else if (secondPlayerCard > firstPlayerCard) {
                secondPlayer.add(secondPlayerCard);
                secondPlayer.add(firstPlayerCard);
            }

        }

        //1. Ako na purviq mu svurshat kartite

        if (firstPlayer.size() == 0) {
            System.out.printf("Second player wins! Sum: %d",getCardsSum(secondPlayer));
        }else if (secondPlayer.size() == 0) {
            System.out.printf("First player wins! Sum: %d", getCardsSum(firstPlayer));
        }

        //2. Ako na vtoriq mu svurshat kartite
    }

    private static int getCardsSum(List<Integer> listCards) {
        int sum = 0;
        for (int card:listCards) {
            sum+= card;

        }
        return sum;
    }
}
