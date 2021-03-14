package model;

public class ExtraPetal {
    private  int length;
    private  int weight;
    private int price;

    public ExtraPetal( int price, int length, int weight) {
        this.price = price;
        this.length = length;
        this.weight = weight;

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ExtraPetal{" +
                "length=" + length +
                ", weight=" + weight +
                '}';
    }
}
