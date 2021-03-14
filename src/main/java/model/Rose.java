package model;

import enums.Color;
import enums.RoseType;


import java.time.LocalDate;

public class Rose extends FlowerBase {

    private RoseType roseType ;
    private int numberOfShipy;

    public Rose(int price, int lengthOfStem, int weight, Color color, RoseType roseType, int numberOfShipy) {
        super(price, lengthOfStem, weight, color);
        this.roseType=roseType;
        this.numberOfShipy = numberOfShipy;
    }

    public RoseType getRoseType() {
        return roseType;
    }

    public void setRoseType(RoseType roseType) {
        this.roseType = roseType;
    }

    public int getNumberOfShipy() {
        return numberOfShipy;
    }

    public void setNumberOfShipy(int numberOfShipy) {
        this.numberOfShipy = numberOfShipy;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "color=" + color +
                ", roseType=" + roseType +
                ", numberOfShipy=" + numberOfShipy +
                '}';
    }
}
