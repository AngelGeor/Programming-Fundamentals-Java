package RegularExpressions_Ex;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> racers = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        Map<String,Integer> racersDistance = new LinkedHashMap<>(); //Ime na sustezatel - distanciq


        for (String racer : racers) {
            racersDistance.put(racer,0);
        }

        String regexLetter = "[A-Za-z]+"; //Regex za bukvi
        Pattern patterLetter = Pattern.compile(regexLetter);

        String regexDigit ="[0-9]"; //Regex za cifri
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = scanner.nextLine();

        while(!input.equals("end of race")) {
            //input = "G4e@55or%6g6!68e!!@"

            //1. Ignoriram specialnite simvoli, koito sa razalichni ot bukvi ili cifri
            //2. bukvite -> suzdavat imeto na sustezatelq
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherName = patterLetter.matcher(input);
            while (matcherName.find()) {
                nameBuilder.append(matcherName.group());
            }
            //3. sumata na cifrite sa ravni na razstoqnite
            int distance = 0;
            Matcher matcherNumber = patternDigit.matcher(input);
            while (matcherNumber.find()){
                distance += Integer.parseInt(matcherNumber.group());
            }

            //Ime na chovek + distanciq
            String racerName = nameBuilder.toString();
            if(racersDistance.containsKey(racerName)) {
                int currentDistance = racersDistance.get(racerName);
                racersDistance.put(racerName, currentDistance + distance);

            }

            input = scanner.nextLine();
        }

        //Sortirame po value v descending order v nov map
        //Nachin 1:
       // Map <String,Integer> firstThreeRacers = racersDistance.entrySet()
      //  .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
       //         .limit(3)
       //         .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue, (a1,a2) -> a1, LinkedHashMap::new));

        //Nachin 2:

        List<String> FirstThreeNames = racersDistance.entrySet()
                .stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + FirstThreeNames.get(0));
        System.out.println("2nd place: " + FirstThreeNames.get(1));
        System.out.println("3rd place: " + FirstThreeNames.get(2));
    }
}
