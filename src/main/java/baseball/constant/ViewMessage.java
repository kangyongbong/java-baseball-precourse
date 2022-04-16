package baseball.constant;

public enum ViewMessage {

    INPUT_NUMBER("숫자를 입력해주세요 : ")
    , RESULT_END("개의 숫자를 모두 맞히셨습니다! 게임 종료")
    , RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    ViewMessage(String message) {
        this.message = message;
    }

    private final String message;

    public String getMessage() {
        return message;
    }
}
