package baseball.constant;

public enum ErrorMessage {

    INPUT_RANGE("1~9사이의 숫자를 입력해주세요.")
    , INPUT_DISTINCT("서로 다른 숫자를 입력해주세요.")
    , INPUT_COUNT("3자리 숫자를 입력해주세요.")
    , RESTART("1 또는 2를 입력해주세요.");

    ErrorMessage(String message) {
        this.message = message;
    }

    private final String message;

    public String getMessage() {
        return message;
    }
}
