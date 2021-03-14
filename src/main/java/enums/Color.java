package enums;

public enum Color {
    WHITE("white") ,
    PINK("pink") ,
    RED("red"),
    YELLOW("yellow"),
    BLUE("blue");

    private String value;
    Color (String value){
        this.value=value;
    }

    public String getValue() {
        return value;
    }
}
