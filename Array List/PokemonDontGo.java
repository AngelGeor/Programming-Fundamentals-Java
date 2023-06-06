package List_Exe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> distanceList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        //"4 5 3" -> split -> ["4", "5", "3"] -> [4, 5, 3] -> {4, 5, 3}

        //1. index е в листа (index >= 0 && index <= последния индекс)
        //2. index < 0
        //3. index > последния индекс
        //стоп: листът с покемони е празен
        //продължаваме: листът е пълен

        int sum = 0;//сума на премахнатите елементи
        while (distanceList.size() > 0) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= distanceList.size() - 1) {
                int removedElement = distanceList.get(index);
                sum += removedElement;
                distanceList.remove(index);
                changeElements(distanceList, removedElement);
            } else if (index < 0) {
                int removedElementFirst = distanceList.get(0);
                sum += removedElementFirst;
                int lastElement = distanceList.get(distanceList.size() - 1); //последния  елемент
                distanceList.set(0, lastElement);
                changeElements(distanceList, removedElementFirst);
            } else if (index > distanceList.size() - 1) {
                int removedElementLast = distanceList.get(distanceList.size() - 1);
                sum += removedElementLast;
                int firstElement = distanceList.get(0);
                distanceList.set(distanceList.size() - 1, firstElement);
                changeElements(distanceList, removedElementLast);
            }
        }
        System.out.println(sum);
    }

    private static void changeElements(List<Integer> distancePokemons, int removedElement) {
        for (int listIndex = 0; listIndex <= distancePokemons.size() - 1; listIndex++) {
            int currentNumber = distancePokemons.get(listIndex);
            if (currentNumber <= removedElement) {
                currentNumber += removedElement;
            } else {
                currentNumber -= removedElement;
            }
            distancePokemons.set(listIndex, currentNumber);
        }
    }
}


