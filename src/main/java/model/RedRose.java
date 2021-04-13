package model;

import enums.Color;

public class RedRose extends FlowerBase {
    int numberOfShipy;
    Color color = Color.RED;

    public RedRose() {
        super(250, 10, 100);
        this.numberOfShipy = 10;
        this.color = Color.RED;
    }

    public RedRose(int price, int lengthOfStem, int weight, int numberOfShipy) {
        super(price, lengthOfStem, weight);
        this.numberOfShipy = numberOfShipy;
    }

    @Override
    public String toString() {
        return "RedRose";
    }
}


