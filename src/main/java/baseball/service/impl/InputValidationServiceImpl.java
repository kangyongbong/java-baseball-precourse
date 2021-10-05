package baseball.service.impl;

import baseball.constant.GameStatusConstant;
import baseball.constant.InputDefinitionConstant;
import baseball.service.InputValidationService;
import baseball.view.OutputView;
import com.sun.tools.javac.util.StringUtils;

public class InputValidationServiceImpl implements InputValidationService {

    private OutputView outputView;

    @Override
    public boolean inputValidation(String inputNumber) {
        String replaceInput = inputNumber.replaceAll(" ","");
        if(!checkRegNumber(replaceInput)) return false;
        if(!checkSizeNumber(replaceInput)) return false;
        if(!checkEmptyNumber(replaceInput)) return false;

        return true;
    }

    @Override
    public boolean reStartValidate(String inputNumber) {
        if(!inputNumber.equals(GameStatusConstant.PLAY) && !inputNumber.equals(GameStatusConstant.END)){
            outputView = new OutputView();
            outputView.continueErrorMsg();

            return false;
        }

        return true;
    }

    @Override
    public boolean checkRegNumber(String num){
        boolean result = num.matches(InputDefinitionConstant.NUM_REG);
        if(!result) {
            outputView = new OutputView();
            outputView.regErrorMsg();
        }

        return result;
    }

    @Override
    public boolean checkSizeNumber(String num){
        boolean result = (num.length() == InputDefinitionConstant.NUM_SIZE);
        if (!result){
            outputView = new OutputView();
            outputView.numberSizeErrorMsg();
        }

        return result;
    }

    @Override
    public boolean checkEmptyNumber(String num){
        boolean result = (!num.equals(""));
        if (!result){
            outputView = new OutputView();
            outputView.emptyErrorMsg();
        }

        return result;
    }
}
