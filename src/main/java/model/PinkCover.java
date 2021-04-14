package model;

import enums.Color;

import java.io.Serializable;

public class PinkCover extends Decor implements Serializable {
    private int width;
    private int length;
    Color color;

    public PinkCover(int width, int length) {
        this.width = width;
        this.length = length;
        this.color = Color.YELLOW;
    }

    public PinkCover() {
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
        return "Pink Cover";
    }
}
