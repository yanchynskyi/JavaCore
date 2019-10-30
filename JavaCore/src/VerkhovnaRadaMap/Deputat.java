package VerkhovnaRadaMap;

import java.util.Objects;

public class Deputat extends Human {
    private String name;
    private String surrame;
    private Integer age;
    private Boolean bribeTaker;
    private Integer bribesSize;

    public Boolean giveBribe (Integer bribe) {
        if(bribeTaker == true && bribe >= bribesSize){
            return true;
        }else {
            return false;
        }
    }

    public Deputat(double weight, double height, String name, String surrame, Integer age, Boolean bribeTaker) {
        super(weight, height);
        this.name = name;
        this.surrame = surrame;
        this.age = age;
        this.bribeTaker = bribeTaker;
    }

    public Deputat(double weight, double height, String name, String surrame, Integer age, Boolean bribeTaker, Integer bribesSize) {
        super(weight, height);
        this.name = name;
        this.surrame = surrame;
        this.age = age;
        this.bribeTaker = bribeTaker;
        this.bribesSize = bribesSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurrame() {
        return surrame;
    }

    public void setSurrame(String surrame) {
        this.surrame = surrame;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(Boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }

    public Integer getBribesSize() {
        return bribesSize;
    }

    public void setBribesSize(Integer bribesSize) {
        this.bribesSize = bribesSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Deputat deputat = (Deputat) o;
        return Objects.equals(name, deputat.name) &&
                Objects.equals(surrame, deputat.surrame) &&
                Objects.equals(age, deputat.age) &&
                Objects.equals(bribeTaker, deputat.bribeTaker) &&
                Objects.equals(bribesSize, deputat.bribesSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, surrame, age, bribeTaker, bribesSize);
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "name='" + name + '\'' +
                ", surrame='" + surrame + '\'' +
                ", age=" + age +
                ", bribeTaker=" + bribeTaker +
                ", bribesSize=" + bribesSize +
                '}';
    }
}
