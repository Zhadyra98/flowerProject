package model;

import enums.Color;

public class Cover  extends Decor {
    private int width;
    private int length;
    Color color;

    public Cover(int width, int length, Color color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }
    public Cover(){
        super.setPrice(280);
        this.length=50;
        super.setWeight(50);
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
        return "Cover{" +
                "color=" + color +
                '}';
    }
}
