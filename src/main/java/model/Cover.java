package model;

import enums.Color;

public class Cover {
    private int price ;
    private int width;
    private int length;
    Color color;

    public Cover(int price, int width, int length, Color color) {
        this.price = price;
        this.width = width;
        this.length = length;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
