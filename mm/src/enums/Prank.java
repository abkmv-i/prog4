package enums;

public enum Prank {
    CHANDELIER(" долго катался на люстре и она упала вместе с ним"),
    JAM(" съел всё-всё варенье дома и ничего не осталось");
    private String translation;

    Prank(String translation) {
        this.translation = translation;

    }

    @Override
    public String toString() {
        return translation;

    }
}
