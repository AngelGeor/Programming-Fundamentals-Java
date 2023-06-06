package TextProcessing_lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split("\\s+");
        List<String> resultList = new ArrayList<>();
        //hi abc add

        for (int i = 0; i < inputArr.length; i++) {
            String currentElement = inputArr[i];
            resultList.add(repeatString(currentElement,currentElement.length()));
        }

        System.out.println(String.join("", resultList));
    }

    public static String repeatString (String word, int count) {
        String[] repeatArr = new String[count];

        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }

        return String.join("", repeatArr);
    }
}
