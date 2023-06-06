package TextProcessing_Ex;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String decryptedText = scanner.nextLine();
        StringBuilder sb = new StringBuilder();


       // for (char symbol: decryptedText.toCharArray()) {
          //  char encryptedSymbol = (char)(symbol + 3);
        // sb.append(encryptedSymbol);
        // }
        char[] decryptedArr = decryptedText.toCharArray();
        for (int i = 0; i < decryptedArr.length; i++) {
            char encryptedSymbol = (char)(decryptedArr[i] + 3);

            sb.append(encryptedSymbol);

        }
        System.out.println(sb);
    }
}