package ObjectAndClasses_Ex.Articles.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listOfStudents = new ArrayList<>();
        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfStudents; i++) {
            String[] studentInfo = scanner.nextLine().split("\\s+");

            String firstName = studentInfo[0];
            String secondName = studentInfo[1];
            double grade = Double.parseDouble(studentInfo[2]);

            Student studentObject = new Student(firstName, secondName, grade);
            listOfStudents.add(studentObject);
        }
        listOfStudents.sort(Comparator.comparing(Student::getGrade).reversed());

        for (Student student: listOfStudents) {
            System.out.println(student);
        }
    }
}
