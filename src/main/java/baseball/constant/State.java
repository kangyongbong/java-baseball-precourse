package baseball.constant;

public enum State {

    STRIKE("스트라이크")
    , BALL("볼")
    , NOTHING("낫싱");

    State(String label) {
        this.lable = label;
    }

    private final String lable;

    public String getLable() {
        return lable;
    }
}
