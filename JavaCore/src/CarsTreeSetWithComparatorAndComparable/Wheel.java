package CarsTreeSetWithComparatorAndComparable;

import java.util.Objects;

public class Wheel {
    private String manufacturer;
    private int size;

    public Wheel() {
    }

    public Wheel(String manufacturer, int size) {
        this.manufacturer = manufacturer;
        this.size = size;
    }

    public Wheel(int size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return size == wheel.size &&
                Objects.equals(manufacturer, wheel.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, size);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufacturer='" + manufacturer + '\'' +
                ", size=" + size +
                '}';
    }
}
