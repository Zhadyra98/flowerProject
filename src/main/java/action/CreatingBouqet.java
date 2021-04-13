package action;

import model.ExtraPetal;
import model.FlowerBase;

import java.util.ArrayList;
import java.util.List;

public class CreatingBouqet {
    List<Object> bouqet = new ArrayList<Object>();
    private Object Cover;
    private Object FlowerBase;
    private Object ExtraPetal;
    private int totalPrice;
    public void addFlowerToBouqet(FlowerBase flower, int count) {
        for (int i = 0; i < count; i++) {
            bouqet.add(flower);
            totalPrice+=flower.getPrice();
        }
    }
    public int getTotalPrice(){
        return totalPrice;
    }

    public void showTheBouqet() {
        System.out.println("There are " + bouqet.toString());
    }

    public void countWeightOfBouqet() {
        int totalWeight = 0;
        for (Object o : bouqet) {
            System.out.println(o.getClass());
            if (o.getClass() == FlowerBase) {
                FlowerBase flower = (FlowerBase) o;
                totalWeight += flower.getWeight();
            }
            if (o.getClass() == ExtraPetal) {
                ExtraPetal petal = (model.ExtraPetal) o;
                totalWeight += petal.getWeight();
            } else {
                continue;
            }
        }
        System.out.println(totalWeight);
    }

    @Override
    public String toString() {

        return  " bouqet=" + bouqet +
                ", Cover=" + Cover +
                ", ExtraPetal=" + ExtraPetal +
                '}';
    }
}
