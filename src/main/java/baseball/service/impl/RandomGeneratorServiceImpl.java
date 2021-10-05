package baseball.service.impl;

import baseball.constant.InputDefinitionConstant;
import baseball.service.RandomGeneratorService;
import nextstep.utils.Randoms;

public class RandomGeneratorServiceImpl implements RandomGeneratorService {

    private StringBuffer randomNumber;

    public RandomGeneratorServiceImpl() {
        randomNumber = new StringBuffer();
    }

    @Override
    public String generatorNumber() {
        return initNumber();
    }

    @Override
    public String initNumber() {
        do {
            int number = Randoms.pickNumberInRange(InputDefinitionConstant.NUM_MIN, InputDefinitionConstant.NUM_MAX);
            validateNumber(number);
        } while (validateSize());

        return randomNumber.toString();
    }

    @Override
    public void validateNumber(int number) {
        if (randomNumber.indexOf("" + number) < 0) {
            randomNumber.append(number);
        }
    }

    @Override
    public boolean validateSize() {
        return randomNumber.length() < InputDefinitionConstant.NUM_SIZE;
    }

}
