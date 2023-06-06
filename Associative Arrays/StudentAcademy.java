package AssociativeArrays_Ex;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        for (int i = 0; i < countOfStudents; i++) {
            String studentName = scanner.nextLine();
            Double grade = Double.parseDouble(scanner.nextLine());

            //Ako studentut Ne sushtestuva:

            if (!studentGrades.containsKey(studentName)) {
                studentGrades.put(studentName, new ArrayList<>());
            }
            studentGrades.get(studentName).add(grade);
        }

        //Tyrsim sredna ocenka na vseki student
        Map<String, Double> studentAverageGrade = new LinkedHashMap<>(); // tozi map e za studentite sus sredna ocenka >= 4.5

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {
            List<Double> grades = entry.getValue();
            String studentName = entry.getKey();
            double averageGrade = getAverageGrade(grades);
            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }
        }

        studentAverageGrade.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(),entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades = 0;
        for (double grade : grades) {
            sumGrades += grade;
        }
        return sumGrades / grades.size();
    }
}

