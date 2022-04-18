package baseball.service;

import baseball.constant.ErrorMessage;

public interface ValidateService {

    public boolean validateInputNumber(String inputNumber);
    public boolean validateInputRange(String inputNumber);
    public boolean validateInputDistinct(String inputNumber);
    public boolean validateInputCount(String inputNumber);
    public boolean validateInputRestart(String inputNumber);
    public boolean validateInputEmpty(String inputNumber);
    public boolean validateInputCharacter(String inputNumber);
}
