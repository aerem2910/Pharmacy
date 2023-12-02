// PharmancyComponent.java
package org.example.seminar.Apteca;

import java.util.Objects;

public class PharmancyComponent implements Comparable<PharmancyComponent> {
    private String name;
    private String weight;
    private int power;

    public PharmancyComponent(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "PharmancyComponent{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(PharmancyComponent o) {
        if (this.power > o.power) {
            return -1;
        } else if (this.power < o.power) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PharmancyComponent that = (PharmancyComponent) o;
        return power == that.power && Objects.equals(name, that.name) && Objects.equals(weight, that.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, power);
    }
}
