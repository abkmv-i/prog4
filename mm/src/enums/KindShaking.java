package enums;

public enum KindShaking {
    LONG_AND_THOROUGHLY(" долго и тщательно"),
    FAST_AND_CAREFULLY(" аккуратно и быстро");
    private String translation;

    KindShaking(String translation) {
        this.translation = translation;

    }

    @Override
    public String toString() {
        return translation;

    }
}
