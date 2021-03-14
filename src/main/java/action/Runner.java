package action;
import enums.Color;
import enums.RoseType;
import model.Cover;
import model.ExtraPetal;
import model.Rose;
import model.Tulip;
public class Runner {
    public static void main(String[] args) {
        Rose whiteRose = new Rose(1, 14,100, Color.WHITE, RoseType.GOLAND,7 );
        Rose pinkRose = new Rose(1, 15,100, Color.PINK, RoseType.BEACH,8 );
        Tulip redTulip = new Tulip(2,10,150,Color.RED,5, false);
        Tulip yellowTulip = new Tulip(2,11,160,Color.YELLOW,6, true);
        Cover coverWhite = new Cover(1,20,20,Color.WHITE);
        ExtraPetal petal = new ExtraPetal(1,10,140);
        CreatingBouqet bouqetCreator = new CreatingBouqet();
        bouqetCreator.addFlowerToBouqet(whiteRose);
        bouqetCreator.addFlowerToBouqet(whiteRose);
        bouqetCreator.addFlowerToBouqet(whiteRose);
        bouqetCreator.addFlowerToBouqet(whiteRose);
        bouqetCreator.addFlowerToBouqet(whiteRose);
        bouqetCreator.addCover(coverWhite);
        bouqetCreator.addPetal(petal);
        bouqetCreator.showTheBouqet();
        bouqetCreator.countWeightOfBouqet();
    }
}
