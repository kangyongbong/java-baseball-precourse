package baseball.constant;

public enum ValidateConstant {

    VALIDATE_MAX("9")
    , VALIDATE_MIN("1")
    , VALIDATE_RANGE("^[1-9]*$")
    , VALIDATE_NUMBER("^[0-9]*$")
    , VALIDATE_SIZE("3")
    , VALIDATE_PLAY("1")
    , VALIDATE_END("2");

    ValidateConstant(String validateCase) {
        this.validateCase = validateCase;
    }

    private final String validateCase;

    public String getValidateCase() {
        return validateCase;
    }

}
