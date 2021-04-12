package model;

import enums.Color;

import javax.xml.crypto.Data;

public class PinkTulip extends FlowerBase{

    private int lifeSize;
    private boolean isWithRoot;
    Color color = Color.PINK;
    public PinkTulip(){
        super.setPrice(350);
        super.setLengthOfStem(29);
        super.setWeight(120);
        this.lifeSize=48;
        this.isWithRoot=true;
    }
    public PinkTulip(int price, int lengthOfStem, int weight,  int lifeSize, boolean isWithRoot) {
        super(price, lengthOfStem, weight);
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
        return "PinkTulip";
    }
}
