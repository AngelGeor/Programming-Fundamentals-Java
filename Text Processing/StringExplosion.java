package TextProcessing_Ex;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        int strength = 0; // silata na atakata
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if(currentSymbol == '>') {
                strength += Integer.parseInt("" + text.charAt(i + 1));
            }else if (currentSymbol != '>' && strength > 0){
                text.deleteCharAt(i);
                 strength --;
                 i--;
            }
        }
        System.out.println(text);
    }
}
