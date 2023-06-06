package Methods_Ex;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine().toLowerCase();
        VowelsCount(inputText);
    }
  public static void VowelsCount (String text) {
        int count = 0;
      for (int i = 0; i < text.length(); i++) {
          char symbol = text.charAt(i);
          if (symbol == 'a' || symbol == 'e' || symbol == 'o' || symbol == 'i'
          || symbol == 'u') {
              count++;
          }
      }
      System.out.println(count);
  }
}