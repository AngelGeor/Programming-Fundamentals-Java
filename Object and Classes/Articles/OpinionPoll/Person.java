package ObjectAndClasses_Ex.Articles.OpinionPoll;

public class Person {
    // Poleta - haraketeristiki
    private String name;
    private int age;



    //metodi - deijstviq, koito moje da pravi choveka

    //Konstruktor
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter -> name:
    public String getName () {
        return this.name;
    }

    //getter -> age:

    public int getAge () {
        return this.age;
    }
}
