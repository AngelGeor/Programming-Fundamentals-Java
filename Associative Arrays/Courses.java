package AssociativeArrays_Ex;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // mapa - kurs , List s imenata na studentite

        Map<String, List<String>> courses = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while(!input.equals("end")) {

            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if(!courses.containsKey(courseName)) {
                courses.put(courseName,new ArrayList<>());
            }
            courses.get(courseName).add(studentName);


            input = scanner.nextLine();
        }

        courses.entrySet().stream()
                .sorted((e1, e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size())) // sortirane po broi na horata
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size()); // printira ime na kursa + kolko choveka sa v kurs
                    e.getValue().stream()
                            .sorted(String::compareTo) // sortira po ascending order
                            .forEach(student -> System.out.println("-- " + student));
                });
    }
}
