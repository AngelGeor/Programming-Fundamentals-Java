package ObjectAndClasses_Ex.Articles.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] personalInfo = scanner.nextLine().split("\\s+");
        List<Person> listOfPeople = new ArrayList<>();
        while (!personalInfo[0].equals("End")) {

            String name = personalInfo[0];
            String id = personalInfo[1];
            int age = Integer.parseInt(personalInfo[2]);
            Person person = new Person(name, id, age);
            listOfPeople.add(person);

            personalInfo = scanner.nextLine().split("\\s+");
        }

        listOfPeople.sort(Comparator.comparing(Person::getAge));

        for (Person person: listOfPeople) {
            System.out.println(person);
        }
    }
}
