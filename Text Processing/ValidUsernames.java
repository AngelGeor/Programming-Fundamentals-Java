package TextProcessing_Ex;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");

        for (String username : usernames) {
            //Proverka dali e validen

            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUsername(String word) {
        //Proverqvame duljinata na dumata
        if (word.length() < 3 || word.length() > 16) {
            return false;
        }
        // Proverka dali imame samo: bukvi, cifri, tirenata, dolni cherti
        for (char symbol : word.toCharArray()) {
            if (!(symbol == '-' || symbol == '_' || Character.isLetterOrDigit(symbol))) {
                return false;
            }
        }
        // ako ne vleznem v prednite 2 proverki, znachi che e validen i vrushtame true
        return true;
    }
}