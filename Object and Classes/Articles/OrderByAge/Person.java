package ObjectAndClasses_Ex.Articles.OrderByAge;

public class Person {
    //Poleta

    private String name;
    private String id;
    private int age;

    //Konstruktor

    public Person (String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    // get age

    public int getAge () {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
    }
}
