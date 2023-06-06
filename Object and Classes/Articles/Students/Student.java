package ObjectAndClasses_Ex.Articles.Students;

public class Student {
    // Poleta
    private String firstName;
    private String secondName;
    private double grade;

    //Konstruktor

    public Student(String firstName, String secondName, double grade) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.grade = grade;
    }

  //Getter za grade

    public double getGrade () {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.firstName, this.secondName, this.grade);
    }
}
