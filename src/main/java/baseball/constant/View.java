package baseball.constant;

public enum View {

    INPUT_NUMBER("숫자를 입력해주세요 : ")
    , RESULT_END("개의 숫자를 모두 맞히셨습니다! 게임 종료")
    , RESTART("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    View(String label) {
        this.label = label;
    }

    private final String label;

    public String getLabel() {
        return label;
    }
}
