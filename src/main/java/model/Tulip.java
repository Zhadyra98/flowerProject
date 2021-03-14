package model;

import enums.Color;

import javax.xml.crypto.Data;

public class Tulip extends FlowerBase{

    private int lifeSize;
    private boolean isWithRoot;

    public Tulip(int price,  int lengthOfStem, int weight, Color color, int lifeSize, boolean isWithRoot) {
        super(price, lengthOfStem, weight, color);
        this.lifeSize=lifeSize;
        this.isWithRoot=isWithRoot;
    }

    public int getLifeSize() {
        return lifeSize;
    }

    public void setLifeSize(int lifeSize) {
        this.lifeSize = lifeSize;
    }

    public boolean isWithRoot() {
        return isWithRoot;
    }

    public void setWithRoot(boolean withRoot) {
        isWithRoot = withRoot;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "color=" + color +
                ", lifeSize=" + lifeSize +
                ", isWithRoot=" + isWithRoot +
                '}';
    }
}
