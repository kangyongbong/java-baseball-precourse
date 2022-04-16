package baseball.constant;

public enum StateMessage {

    STRIKE("스트라이크")
    , BALL("볼")
    , NOTHING("낫싱");

    StateMessage(String message) {
        this.message = message;
    }

    private final String message;

    public String getMessage() {
        return message;
    }
}
