package baseball.service.impl;

import baseball.constant.GameStatus;
import baseball.model.RandomNumber;
import baseball.model.Result;
import baseball.model.UserNumber;
import baseball.service.BaseBallService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BaseBallServiceImplTest {


    String testNumber = "";
    String rangeNumber = "";
    String distinctNumber = "";
    String cntNumber = "";
    String restartNumber = "";
    String emptyNumber = "";
    String charNumber = "";

    private BaseBallService baseBallService;
    private UserNumber userNumber;
    private Result result;
    private RandomNumber randomNumber;

    @BeforeEach
    void setUp() {
        testNumber = "123";
        rangeNumber = "012";
        distinctNumber = "112";
        cntNumber = "1234";
        restartNumber = "3";
        emptyNumber = " ";
        charNumber = "a12";
        baseBallService = new BaseBallServiceImpl();
        this.userNumber = new UserNumber();
        this.result = new Result();
        this.randomNumber = new RandomNumber();
    }

    @Test
    @DisplayName("재시작 입력값 검증")
    void restartCheck() {
        assertThat(baseBallService.restartCheck("2")).isEqualTo(GameStatus.END);
        assertThatThrownBy(() -> baseBallService.restartCheck(restartNumber)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("렌덤 숫자 생성")
    void makeRandom() {
        baseBallService.makeRandom(randomNumber);
        assertThat(randomNumber.getRandomNum().size()).isEqualTo(3);
    }

    @Test
    @DisplayName("렌덤 숫자와 입력값의 검증을 위한 데이터 분리")
    void judgment() {
        baseBallService.makeRandom(randomNumber);
        List<Integer> numbers = new ArrayList<>();
        for (String s : testNumber.split("")) {
            numbers.add(Integer.parseInt(s));
        }

        userNumber.setGameNum(numbers);
        Iterator<Integer> random = randomNumber.getRandomNum().iterator();

        int currIndex = 0;
        Integer CurrentElement = null;

        while (random.hasNext()) {
            CurrentElement = random.next();
            assertThat(CurrentElement == null).isFalse();
            assertThat(userNumber.getGameNum().get(currIndex) == null).isFalse();
            currIndex++;
        }
    }
}