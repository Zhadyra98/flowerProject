package model;

import enums.Color;

import javax.xml.crypto.Data;
import java.time.LocalDate;

public abstract class FlowerBase {
    private int price;
    private LocalDate dateOfCame;
    private int lengthOfStem;
    private int weight;
    Color color;

    protected FlowerBase(int price,  int lengthOfStem, int weight, Color color) {
        this.price = price;
        this.lengthOfStem = lengthOfStem;
        this.weight = weight;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDateOfCame() {
        return dateOfCame;
    }

    public int getLengthOfStem() {
        return lengthOfStem;
    }

    public void setLengthOfStem(int lengthOfStem) {
        this.lengthOfStem = lengthOfStem;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
