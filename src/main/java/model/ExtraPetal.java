package model;

public class ExtraPetal extends Decor {
    private  int length;


    public ExtraPetal( int price, int length, int weight) {
        this.length = length;
    }
    public ExtraPetal(){
        super.setPrice(280);
        this.length=50;
        super.setWeight(50);
    }
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "ExtraPetal{" +
                "length=" + length +
                '}';
    }
}
