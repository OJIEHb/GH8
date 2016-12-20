package beans;

/**
 * Created by andrey on 15.12.16.
 */
public class Car {
    private String color;
    private int maxSpeed;
    private String type;
    private String model;

    public Car(){}

    public Car(String color, int maxSpeed, String type, String model) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.model = model;
    }
}
