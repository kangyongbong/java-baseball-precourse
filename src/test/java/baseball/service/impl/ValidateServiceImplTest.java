package baseball.service.impl;

import baseball.constant.ValidateConstant;
import baseball.service.ValidateService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ValidateServiceImplTest {

    String testNumber = "";
    String rangeNumber = "";
    String distinctNumber = "";
    String cntNumber = "";
    String restartNumber = "";
    String emptyNumber = "";
    String charNumber = "";

    ValidateService validateService;

    @BeforeEach
    void setUp() {
        testNumber = "123";
        rangeNumber = "012";
        distinctNumber = "112";
        cntNumber = "1234";
        restartNumber = "3";
        emptyNumber = " ";
        charNumber = "a12";
        validateService = new ValidateServiceImpl();
    }

    @Test
    @DisplayName("입력값 검증")
    void validateInputNumber() {
        assertThatThrownBy(() -> validateService.validateInputNumber(rangeNumber)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("입력값의 범위에 대한 검증")
    void validateInputRange() {
        assertThat(rangeNumber.matches(ValidateConstant.VALIDATE_RANGE.getValidateCase())).isFalse();
    }

    @Test
    @DisplayName("입력값의 중복 검증")
    void validateInputDistinct() {
        assertThatThrownBy(() -> validateService.validateInputDistinct(distinctNumber)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("입력값 개수 검증")
    void validateInputCount() {
        assertThat(cntNumber.length() != Integer.parseInt(ValidateConstant.VALIDATE_SIZE.getValidateCase())).isTrue();
    }

    @Test
    @DisplayName("재시작 입력값 검증")
    void validateInputRestart() {
        assertThat(restartNumber.equals(ValidateConstant.VALIDATE_END.getValidateCase())).isFalse();
        assertThat(restartNumber.equals(ValidateConstant.VALIDATE_PLAY.getValidateCase())).isFalse();
    }

    @Test
    @DisplayName("입력값 공백 검증")
    void validateInputEmpty() {
        assertThat(emptyNumber.isEmpty()).isTrue();
    }

    @Test
    @DisplayName("숫자 이외에 입력값 검증")
    void validateInputCharacter() {
        assertThat(charNumber.matches(ValidateConstant.VALIDATE_NUMBER.getValidateCase())).isTrue();
    }
}