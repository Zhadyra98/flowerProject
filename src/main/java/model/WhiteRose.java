package model;

import enums.Color;

public class WhiteRose extends FlowerBase{
    int numberOfShipy;
    Color color = Color.WHITE;
    public WhiteRose(){
        super(250,10,100);
        this.numberOfShipy=10;
        this.color=Color.WHITE;
    }
    public WhiteRose(int price, int lengthOfStem, int weight, int numberOfShipy) {
        super(price, lengthOfStem, weight);
        this.numberOfShipy=numberOfShipy;
    }
    @Override
    public String toString() {
        return "WhiteRose " ;
    }
}
