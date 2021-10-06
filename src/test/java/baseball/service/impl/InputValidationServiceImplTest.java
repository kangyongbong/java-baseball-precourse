package baseball.service.impl;

import static org.assertj.core.api.Assertions.*;

import baseball.constant.GameStatusConstant;
import baseball.constant.InputDefinitionConstant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputValidationServiceImplTest {

    @Test
    @DisplayName("사용자의 실수로 인한 1,2외 다른숫자 입력")
    void reStartValidate() {
        String replaceInput = "1 ".replaceAll(" ","");
        assertThat(!replaceInput.equals(GameStatusConstant.PLAY) && !replaceInput.equals(GameStatusConstant.END)).isFalse();

        String replaceInput1 = " 2 ".replaceAll(" ","");
        assertThat(!replaceInput1.equals(GameStatusConstant.PLAY) && !replaceInput1.equals(GameStatusConstant.END)).isFalse();

        String replaceInput2 = "a ".replaceAll(" ","");
        assertThat(!replaceInput2.equals(GameStatusConstant.PLAY) && !replaceInput2.equals(GameStatusConstant.END)).isTrue();
    }

    @Test
    @DisplayName("1-9까지의 숫자인지 확인")
    void checkRegNumber() {
        assertThat("123".matches(InputDefinitionConstant.NUM_REG)).isTrue();
        assertThat("abc".matches(InputDefinitionConstant.NUM_REG)).isFalse();
        assertThat("9 8 7".matches(InputDefinitionConstant.NUM_REG)).isFalse();
        assertThat("012".matches(InputDefinitionConstant.NUM_REG)).isFalse();
    }

    @Test
    @DisplayName("입력한 숫자의 사이즈가 3자리인지 확인")
    void checkSizeNumber() {
        assertThat("123".length() == InputDefinitionConstant.NUM_SIZE).isTrue();
        assertThat("98765".length() == InputDefinitionConstant.NUM_SIZE).isFalse();
        assertThat("as".length() == InputDefinitionConstant.NUM_SIZE).isFalse();
    }

    @Test
    @DisplayName("공백만 입력했는지 확인")
    void checkEmptyNumber() {
        assertThat(!"123".replaceAll(" ","").equals("")).isTrue();
        assertThat(!"1 2 3".replaceAll(" ","").equals("")).isTrue();
        assertThat(!" ".replaceAll(" ","").equals("")).isFalse();
    }
}