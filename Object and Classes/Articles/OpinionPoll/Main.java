package ObjectAndClasses_Ex.Articles.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        List<Person> listOfPeople = new ArrayList<>();
        for (int i = 0; i < numberOfPeople; i++) {
            String[] personalInfo = scanner.nextLine().split("\\s+");
            String name = personalInfo[0];
            int age = Integer.parseInt(personalInfo[1]);
            Person person = new Person(name, age);

            if (age > 30) {
                listOfPeople.add(person);
            }
        }
        listOfPeople.sort(Comparator.comparing(Person::getName));
        for (Person person: listOfPeople) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

