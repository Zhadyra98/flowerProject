package model;

import java.io.Serializable;

public class Decor implements Serializable {
    private int price;
    private int weight;

    public int getPrice() {
        return price;
    }

    public Decor() {

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
