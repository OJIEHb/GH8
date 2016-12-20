package beans;

/**
 * Created by andrey on 15.12.16.
 */
public class Human {
    private int height;
    private String gender;
    private int age;
    private int weight;

    public Human(){}

    public Human(int height, String gender, int age, int weight) {
        this.height = height;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }
}
