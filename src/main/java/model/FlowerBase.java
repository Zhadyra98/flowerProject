package model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class FlowerBase implements Serializable {
    private int price;
    private LocalDate dateOfCame;
    private int lengthOfStem;
    private int weight;

    protected FlowerBase(int price, int lengthOfStem, int weight) {
        this.price = price;
        this.lengthOfStem = lengthOfStem;
        this.weight = weight;
    }

    public FlowerBase() {
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

    @Override
    public String toString() {
        return "came " + dateOfCame +
                ", price is " + price +
                ", lengthOfStem is " + lengthOfStem +
                ", weight is " + weight;
    }
}
