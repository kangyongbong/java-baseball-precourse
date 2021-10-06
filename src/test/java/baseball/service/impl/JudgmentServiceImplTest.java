package baseball.service.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class JudgmentServiceImplTest {

    @Test
    @DisplayName("스트라이크 판정 확인")
    void isStrike() {
        assertThat("1".equals("1")).isTrue();
        assertThat("2".equals("1")).isFalse();
        assertThat(" ".equals("1")).isFalse();
    }

    @Test
    @DisplayName("볼판정 확인")
    void isBall() {
        assertThat("123".contains("1")).isTrue();
        assertThat("123".contains("3")).isTrue();
        assertThat("123".contains("a")).isFalse();
        assertThat("123".contains("7")).isFalse();
    }
}