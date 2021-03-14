package enums;

public enum RoseType {
    GOLAND("Goland"),
    BEACH("Beach") ,
    SWEET("Sweet"),
    MULTIFLORA("Multiflora");

    private String value;
    RoseType (String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
