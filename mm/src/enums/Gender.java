package enums;

public enum Gender {
    MAN("Мужчина"),
    WOMAN("Женщина");
    private String translation;

    Gender(String translation) {
        this.translation = translation;

    }

    @Override
    public String toString() {
        return translation;

    }
}