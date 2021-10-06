package baseball.service.impl;

import static org.assertj.core.api.Assertions.*;

import baseball.constant.InputDefinitionConstant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomGeneratorServicReImplTest {

    @Test
    @DisplayName("랜덤번호 검증")
    void validateNumber() {
        assertThat("123".indexOf(""+1)).isEqualTo(0);
        assertThat("123".indexOf(""+3)).isEqualTo(2);
        assertThat("123".indexOf(""+4)).isEqualTo(-1);
        assertThat("123".indexOf(""+4)).isNotEqualTo(1);
    }

    @Test
    @DisplayName("랜덤번호 사이즈체크")
    void validateSize() {
        StringBuffer testString = new StringBuffer("123");
        assertThat(testString.length() < InputDefinitionConstant.NUM_SIZE).isFalse();
        assertThat(testString.length() > InputDefinitionConstant.NUM_SIZE).isFalse();
        assertThat(testString.length() == InputDefinitionConstant.NUM_SIZE).isTrue();
    }
}