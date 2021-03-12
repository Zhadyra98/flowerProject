package flowers;

import javax.xml.crypto.Data;

abstract class FlowerBase {
    private int price;
    private Data dateOfCame;
    private int lengthOfStem;
    private int weight;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Data getDateOfCame() {
        return dateOfCame;
    }

    public void setDateOfCame(Data dateOfCame) {
        this.dateOfCame = dateOfCame;
    }

    public int getLengthOfStem() {
        return lengthOfStem;
    }

    public void setLengthOfStem(int lengthOfStem) {
        this.lengthOfStem = lengthOfStem;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
