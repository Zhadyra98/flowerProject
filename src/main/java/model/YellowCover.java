package model;

import enums.Color;

import java.io.Serializable;

public class YellowCover extends Decor implements Serializable {
    private int width;
    private int length;
    Color color;

    public YellowCover(int width, int length) {
        this.width = width;
        this.length = length;
        this.color = Color.YELLOW;
    }

    public YellowCover() {
        super.setPrice(280);
        this.length = 50;
        super.setWeight(50);
        this.color = Color.YELLOW;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
    }

    @Override
    public String toString() {
        return "Yellow Cover";
    }
}
