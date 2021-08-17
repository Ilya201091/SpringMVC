package web.model;

import java.util.List;

public class Car {
    private String model;
    private int power;
    private String color;

    public Car(String model, int power, String color) {
        this.model = model;
        this.power = power;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}
