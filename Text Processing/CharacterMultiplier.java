package TextProcessing_Ex;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");

        String firstText = input[0];
        String secondText = input[1];

        int max = Math.max(firstText.length(), secondText.length());
        int sum = 0;
        for (int i = 0; i < max; i++) {
            if(i < firstText.length() && i < secondText.length()) {
                sum += firstText.charAt(i) * secondText.charAt(i);
            }else if (i < firstText.length()){
                sum+= firstText.charAt(i);
            }else {
                sum+= secondText.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
