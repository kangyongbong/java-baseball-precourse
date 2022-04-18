package baseball.service;

import baseball.constant.ErrorMessage;

public interface ValidateService {

    public void validateInputNumber(String inputNumber);
    public void validateInputRange(String inputNumber);
    public void validateInputDistinct(String inputNumber);
    public void validateInputCount(String inputNumber);
    public void validateInputRestart(String inputNumber);
    public void validateInputEmpty(String inputNumber);
    public void validateInputCharacter(String inputNumber);
}
