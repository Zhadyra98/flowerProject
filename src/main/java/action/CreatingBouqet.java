package action;

import model.Cover;
import model.ExtraPetal;
import model.FlowerBase;

import java.util.ArrayList;
import java.util.List;

public class CreatingBouqet {
    List <Object> bouqet = new ArrayList<Object>();
    private Object Cover;
    private Object FlowerBase;
    private Object ExtraPetal;

    public void addFlowerToBouqet(FlowerBase flower){
        bouqet.add(flower);
    }
    public void addCover(Cover cover){
        bouqet.add(cover);
    }
    public void addPetal(ExtraPetal petal){
        bouqet.add(petal);
    }
    public void showTheBouqet(){
        System.out.println("There are "+bouqet.toString());
    }
    public void  countWeightOfBouqet(){
        int totalWeight = 0;
        for(Object o : bouqet){
            System.out.println(o.getClass());
            if(o.getClass()==FlowerBase){
                FlowerBase flower = (FlowerBase)o;
                totalWeight+=flower.getWeight();
            }
            if(o.getClass()==ExtraPetal){
                ExtraPetal petal = (model.ExtraPetal) o;
                totalWeight+=petal.getWeight();
            }
            else {
                continue;
            }
        }
        System.out.println( totalWeight);
    }


}
