package baseball.service.impl;

import baseball.constant.ErrorMessage;
import baseball.constant.ValidateConstant;
import baseball.service.ValidateService;
import baseball.view.OutputView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ValidateServiceImpl implements ValidateService {

    private OutputView outputView;

    public ValidateServiceImpl() {
        outputView = new OutputView();
    }

    @Override
    public boolean validateInputNumber(String inputNumber) {
        if (validateInputEmpty(inputNumber) || validateInputCount(inputNumber) || validateInputCharacter(inputNumber)
                || validateInputRange(inputNumber) || validateInputDistinct(inputNumber)) {
            return true;
        }

        return false;
    }

    @Override
    public boolean validateInputRange(String inputNumber) {
        if(!inputNumber.matches(ValidateConstant.VALIDATE_RANGE.getValidateCase())){
            outputView.outputError(ErrorMessage.INPUT_RANGE);
            return true;
        }

        return false;
    }

    @Override
    public boolean validateInputDistinct(String inputNumber) {
        String[] splitNum = inputNumber.split("");
        ArrayList<String> listNum = new ArrayList<String>(Arrays.asList(splitNum));
        if (checkDistinctLoop(splitNum, listNum)) {
            outputView.outputError(ErrorMessage.INPUT_DISTINCT);
            return true;
        }

        return false;
    }

    private boolean checkDistinctLoop(String[] splitNum, ArrayList<String> listNum) {
        int checkCnt = 0;
        for (String num : splitNum) {
            checkCnt += Collections.frequency(listNum, num);
        }

        return checkDistinctIf(checkCnt);
    }

    private boolean checkDistinctIf(int checkCnt) {
        if (checkCnt > Integer.parseInt(ValidateConstant.VALIDATE_SIZE.getValidateCase())) {
            return true;
        }

        return false;
    }

    @Override
    public boolean validateInputCount(String inputNumber) {
        if (inputNumber.length() != Integer.parseInt(ValidateConstant.VALIDATE_SIZE.getValidateCase())) {
            outputView.outputError(ErrorMessage.INPUT_COUNT);
            return true;
        }

        return false;
    }

    @Override
    public boolean validateInputRestart(String inputNumber) {
        if (!inputNumber.equals(ValidateConstant.VALIDATE_PLAY.getValidateCase())
                && !inputNumber.equals(ValidateConstant.VALIDATE_END.getValidateCase())) {
            outputView.outputError(ErrorMessage.INPUT_RESTART);
            return true;
        }

        return false;
    }

    @Override
    public boolean validateInputEmpty(String inputNumber) {
        if (inputNumber.isEmpty()) {
            outputView.outputError(ErrorMessage.INPUT_EMPTY);
            return true;
        }

        return false;
    }

    @Override
    public boolean validateInputCharacter(String inputNumber) {
        if(!inputNumber.matches(ValidateConstant.VALIDATE_NUMBER.getValidateCase())){
            outputView.outputError(ErrorMessage.INPUT_CHARACTER);
            return true;
        }

        return false;
    }
}
