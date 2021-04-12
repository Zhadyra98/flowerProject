package model;

import java.util.Vector;

public class Bouqet {
    String name ;
    Vector<FlowerBase> allFlowers = new Vector<>();
    Vector<Decor> allDecors = new Vector<>();
    int totalPrice;
    int totalWeight;
    public Bouqet(String nameOfBouqet){
        this.name=nameOfBouqet;
    }
    public int getTotalPrice() {
        for(FlowerBase item : allFlowers){
            totalPrice+= item.getPrice();
        }
        for (Decor decor : allDecors){
            totalPrice+=decor.getPrice();
        }
        return totalPrice;
    }
    public int getTotalWeight() {
        for(FlowerBase item : allFlowers){
            totalWeight+= item.getWeight();
        }
        for (Decor decor : allDecors){
            totalWeight+=decor.getWeight();
        }
        return totalWeight;
    }
    public void addFlowerToBouqet( FlowerBase flower, int amount){
        for(int i=0; i<amount; i++){
            this.allFlowers.add(flower);
        }
    }
    @Override
    public String toString() {
        return " allFlowers=" + allFlowers +
                ", allDecors=" + allDecors ;
    }
    public static Vector initializeTheFlowerChoiceVector(){
        Vector<FlowerBase> allTypesOfFlower = new Vector<>();
        allTypesOfFlower.add(new WhiteRose());
        allTypesOfFlower.add(new PinkTulip());
        allTypesOfFlower.add(new RedRose());
        return allTypesOfFlower;
    }
    public static Vector initializeTheDecorChoiceVector(){
        Vector<Decor> allTypesOfDecor = new Vector<>();
        allTypesOfDecor.add(new Cover());
        allTypesOfDecor.add(new ExtraPetal());
        return allTypesOfDecor;
    }
}
