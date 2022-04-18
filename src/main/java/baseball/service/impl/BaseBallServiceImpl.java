package baseball.service.impl;

import baseball.constant.GameStatus;
import baseball.model.RandomNumber;
import baseball.model.Result;
import baseball.model.UserNumber;
import baseball.service.BaseBallService;
import baseball.service.ValidateService;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class BaseBallServiceImpl implements BaseBallService {

    private ValidateService validateService;
    private UserNumber userNumber;
    private Result result;
    private RandomNumber randomNumber;

    public BaseBallServiceImpl() {
        this.validateService = new ValidateServiceImpl();
        this.userNumber = new UserNumber();
        this.result = new Result();
        this.randomNumber = new RandomNumber();
    }

    @Override
    public Result baseBall(String inputNumber) {
        validateService.validateInputNumber(inputNumber);
        convertToList(inputNumber);
        makeRandom(randomNumber);
        playGame(userNumber, randomNumber);

        return result;
    }

    @Override
    public GameStatus restartCheck(String inputRestart) {
        return checkRestartData(inputRestart);
    }

    private GameStatus checkRestartData(String inputRestart) {
        validateService.validateInputRestart(inputRestart);
        if ("1".equals(inputRestart)) {
            return GameStatus.RESTART;
        }

        return GameStatus.END;
    }

    @Override
    public void makeRandom(RandomNumber randomNumber) {
        LinkedHashSet<Integer> setRandom = new LinkedHashSet<>();
        while (setRandom.size() < 3) {
            setRandom.add(Randoms.pickNumberInRange(1, 9));
        }

        randomNumber.setRandomNum(setRandom);
    }

    private void convertToList(String inputNumber) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : inputNumber.split("")) {
            numbers.add(Integer.parseInt(s));
        }

        userNumber.setGameNum(numbers);
    }

    private void playGame(UserNumber userNumber, RandomNumber randomNumber) {
        Iterator<Integer> random = randomNumber.getRandomNum().iterator();
        judgment(random, userNumber.getGameNum());
    }

    public void judgment(Iterator<Integer> random, List<Integer> inputNumber) {
        int currIndex = 0;
        Integer CurrentElement = null;

        while (random.hasNext()) {
            CurrentElement = random.next();
            makeResult(CurrentElement, inputNumber.get(currIndex), currIndex+1);
            currIndex++;
        }
        isNothing();
    }

    public void makeResult(Integer random, Integer input, int currIndex){
        if (isStrike(random, input, currIndex)) return;
        if (isBall(input, currIndex)) return;
    }

    private boolean isStrike(Integer random, Integer input, int currIndex) {
        if (random.equals(input)) {
            result.setCntStrike(result.getCntStrike() + 1);
            return true;
        }

        return false;
    }

    private boolean isBall(Integer input, int currIndex) {
        if (randomNumber.getRandomNum().contains(input)) {
            result.setCntBall(result.getCntBall() + 1);
            return true;
        }

        return false;
    }

    private void isNothing() {
        if (result.getCntStrike() + result.getCntBall() == 0) {
            result.setCntNothing(1);
        }
    }
}
