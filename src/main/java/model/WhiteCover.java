package model;

import enums.Color;

public class WhiteCover  extends Decor {
    private int width;
    private int length;
    Color color;

    public WhiteCover(int width, int length) {
        this.width = width;
        this.length = length;
        this.color = Color.WHITE;
    }
    public WhiteCover(){
        super.setPrice(280);
        this.length=50;
        super.setWeight(50);
        this.color=Color.WHITE;
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
        return "White Cover";
    }
}

