package main.java;

public class Item {
    private String name;
    private String grade;
    private float power;
    private float weight;
    private int price;

    public Item(String name, String grade, float power, float weight, int price) {
        this.name = name;
        this.grade = grade;
        this.power = power;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public float getPower() {
        return power;
    }

    public float getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
