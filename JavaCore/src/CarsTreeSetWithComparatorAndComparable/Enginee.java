package CarsTreeSetWithComparatorAndComparable;

import java.util.Objects;

public class Enginee {
    private String model;
    private double engineOfCapacity;
    private int power;

    public Enginee() {
    }

    public Enginee(String model, double engineOfCapacity, int power) {
        this.model = model;
        this.engineOfCapacity = engineOfCapacity;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public double getEngineOfCapacity() {
        return engineOfCapacity;
    }

    public int getPower() {
        return power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineOfCapacity(double engineOfCapacity) {
        this.engineOfCapacity = engineOfCapacity;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enginee enginee = (Enginee) o;
        return Double.compare(enginee.engineOfCapacity, engineOfCapacity) == 0 &&
                power == enginee.power &&
                Objects.equals(model, enginee.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, engineOfCapacity, power);
    }

    @Override
    public String toString() {
        return "Enginee{" +
                "model='" + model + '\'' +
                ", engineOfCapacity=" + engineOfCapacity +
                ", power=" + power +
                '}';
    }
}
