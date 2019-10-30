package CarsTreeSetWithComparatorAndComparable;

import java.util.Objects;

public class Car implements Comparable<Car>{
    private String model;
    private int year;
    private int number;
    private String color;
    private Enginee enginee;
    private Wheel wheel;



    public Car(String model, int year, int number, String color, Enginee enginee, Wheel wheel) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.color = color;
        this.enginee = enginee;
        this.wheel = wheel;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }

    public Enginee getEnginee() {
        return enginee;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEnginee(Enginee enginee) {
        this.enginee = enginee;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year &&
                number == car.number &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color) &&
                Objects.equals(enginee, car.enginee) &&
                Objects.equals(wheel, car.wheel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, number, color, enginee, wheel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number=" + number +
                ", color='" + color + '\'' +
                ", enginee=" + enginee +
                ", wheel=" + wheel +
                '}';
    }

    @Override
    public int compareTo(Car anotherYear) {
        if (this.year == anotherYear.year) {
            return 0;
        } else if (this.year < anotherYear.year) {
            return -1;
        } else {
            return 1;
        }
    }
}
