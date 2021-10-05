package baseball.service;

public interface InputValidationService {

    public boolean inputValidation(String inputNumber);

    public boolean reStartValidate(String inputNumber);

    public boolean checkRegNumber(String num);

    public boolean checkSizeNumber(String num);

    public boolean checkEmptyNumber(String num);
}
