package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class Bouqet implements Serializable {
    String name;
    Vector<FlowerBase> allFlowers = new Vector<>();
    Vector<Decor> allDecors = new Vector<>();
    Date dateTimeCame;
    int totalPrice;
    int totalWeight;

    public Bouqet(String nameOfBouqet) {
        dateTimeCame = new Date();
        this.name = nameOfBouqet;
    }

    public int getTotalPrice() {
        for (FlowerBase item : allFlowers) {
            totalPrice += item.getPrice();
        }
        for (Decor decor : allDecors) {
            totalPrice += decor.getPrice();
        }
        return totalPrice;
    }

    public int getTotalWeight() {
        for (FlowerBase item : allFlowers) {
            totalWeight += item.getWeight();
        }
        for (Decor decor : allDecors) {
            totalWeight += decor.getWeight();
        }
        return totalWeight;
    }

    public void addFlowerToBouqet(FlowerBase flower, int amount) {
        for (int i = 0; i < amount; i++) {
            this.allFlowers.add(flower);
        }
    }

    public void addDecorToBouqet(Decor decor) {
        this.allDecors.add(decor);
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        return this.name + " has " + allFlowers +
                allDecors +
                "date of came =" + formatter.format(this.dateTimeCame);
    }

    public static Vector initializeTheFlowerChoiceVector() {
        Vector<FlowerBase> allTypesOfFlower = new Vector<>();
        allTypesOfFlower.add(new WhiteRose());
        allTypesOfFlower.add(new PinkTulip());
        allTypesOfFlower.add(new RedRose());
        return allTypesOfFlower;
    }

    public static Vector initializeTheDecorChoiceVector() {
        Vector<Decor> allTypesOfDecor = new Vector<>();
        allTypesOfDecor.add(new WhiteCover());
        allTypesOfDecor.add(new PinkCover());
        allTypesOfDecor.add(new YellowCover());
        allTypesOfDecor.add(new ExtraPetal());
        return allTypesOfDecor;
    }
}
