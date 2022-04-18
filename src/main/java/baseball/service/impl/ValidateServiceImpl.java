package baseball.service.impl;

import baseball.constant.ErrorMessage;
import baseball.constant.ValidateConstant;
import baseball.service.ExceptionService;
import baseball.service.ValidateService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ValidateServiceImpl implements ValidateService {

    private ExceptionService exceptionService;

    public ValidateServiceImpl() {
        exceptionService = new ExceptionServiceImpl();
    }

    @Override
    public void validateInputNumber(String inputNumber) {
        validateInputEmpty(inputNumber);
        validateInputCount(inputNumber);
        validateInputCharacter(inputNumber);
        validateInputRange(inputNumber);
        validateInputDistinct(inputNumber);
    }

    @Override
    public void validateInputRange(String inputNumber) {
        if(!inputNumber.matches(ValidateConstant.VALIDATE_RANGE.getValidateCase())){
            exceptionService.inputException(ErrorMessage.INPUT_RANGE);
        }
    }

    @Override
    public void validateInputDistinct(String inputNumber) {
        String[] splitNum = inputNumber.split("");
        ArrayList<String> listNum = new ArrayList<String>(Arrays.asList(splitNum));
        if (checkDistinctLoop(splitNum, listNum)) {
            exceptionService.inputException(ErrorMessage.INPUT_DISTINCT);
        }
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
    public void validateInputCount(String inputNumber) {
        if (inputNumber.length() != Integer.parseInt(ValidateConstant.VALIDATE_SIZE.getValidateCase())) {
            exceptionService.inputException(ErrorMessage.INPUT_COUNT);
        }
    }

    @Override
    public void validateInputRestart(String inputNumber) {
        if (!inputNumber.equals(ValidateConstant.VALIDATE_PLAY.getValidateCase())
                && !inputNumber.equals(ValidateConstant.VALIDATE_END.getValidateCase())) {
            exceptionService.inputException(ErrorMessage.INPUT_RESTART);
        }
    }

    @Override
    public void validateInputEmpty(String inputNumber) {
        if (inputNumber.isEmpty()) {
            exceptionService.inputException(ErrorMessage.INPUT_EMPTY);
        }
    }

    @Override
    public void validateInputCharacter(String inputNumber) {
        if(!inputNumber.matches(ValidateConstant.VALIDATE_NUMBER.getValidateCase())){
            exceptionService.inputException(ErrorMessage.INPUT_CHARACTER);
        }
    }
}
