package Lists_Lab;

import javax.crypto.SealedObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> SecondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        // Trqbva da interirame po duljinata na po-malkiq list
        int minSize = Math.min(firstList.size(), SecondList.size());


        for (int i = 0; i < minSize; i++) {
            int firstItem = firstList.get(i);
            int secondItem = SecondList.get(i);

            resultList.add(firstItem);
            resultList.add(secondItem);

        }

        // Sravnqvame dvata lista i ot po - dulgiq list vzimam chislata koito sa sled minSize, i gi vkarvame v
        // otdelen list - sublist!

        if (firstList.size() > SecondList.size()) {
            resultList.addAll(firstList.subList(minSize, firstList.size() ));
        }else {
            resultList.addAll(SecondList.subList(minSize, SecondList.size() ));
        }

        System.out.println(resultList.toString().replaceAll("[\\[\\],]", ""));
    }
}
