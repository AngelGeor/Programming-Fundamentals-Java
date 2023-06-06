package RegularExpressions_Ex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMessages = Integer.parseInt(scanner.nextLine());
        String regex = "@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!(?<attack>[AD])![^@\\-!:>]*->(?<soldierCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);

        List<String> AttackersPlanets = new ArrayList<>(); //Spisuk za planeti s tip A
        List<String> DestroyedPlanets = new ArrayList<>(); //Spisuk s planeti s tip D

        //1. Decriptirame suobshtenieto
        for (int i = 0; i < countMessages; i++) {
            String encryptedMessage = scanner.nextLine();
            String decryptedMessage = getDecryptedMessage(encryptedMessage);
            //decryptedMessage = "PQ@Alderaa1:30000!A!->20000"
            Matcher matcher = pattern.matcher(decryptedMessage);

            if(matcher.find()) {
                String planetName = matcher.group("planetName");
              //  int population = Integer.parseInt(matcher.group("population"));
                String attackType = matcher.group("attack"); // A or D
             //   int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if(attackType.equals("A")) {
                    AttackersPlanets.add(planetName);
                }else if(attackType.equals("D")){
                    DestroyedPlanets.add(planetName);
                }

            }

        }
        System.out.println("Attacked planets: " + AttackersPlanets.size());
        Collections.sort(AttackersPlanets);
        AttackersPlanets.forEach(planet -> System.out.println("-> " + planet));

        System.out.println("Destroyed planets: " + DestroyedPlanets.size());
        Collections.sort(DestroyedPlanets);
        DestroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
    }

    private static String getDecryptedMessage(String encryptedMessage) {
        //1. namirame broqt na bukvite [s, S, t,T,a,A,r,R] v kriptiraneto suboshtenie


        int countLetters = getSpecialLettersCount(encryptedMessage);
        StringBuilder decryptedMessage = new StringBuilder();
        //Vzimame ASCII koda vsqka edna bukva ot kriptiranoto suobshtenie
        // sled tova -> ascii code - countLetters = poluchavame ASCII na novata bukva
        //novata bukva q dobavqme kum dekriptiranoto subosthtenie;

        for (char symbol: encryptedMessage.toCharArray()) {
            char newSymbol = (char)(symbol - countLetters);
            decryptedMessage.append(newSymbol);
        }
        return decryptedMessage.toString();
    }

    private static int getSpecialLettersCount(String encryptedMessage) {
        int counter = 0;
        for (char symbol: encryptedMessage.toLowerCase().toCharArray()) {
            if(symbol == 's' || symbol == 'a' || symbol == 'r' || symbol == 't'){
                counter ++;
            }
        }
        return  counter;
    }
}
