package baseball.service;

public interface RandomGeneratorService {

    public String generatorNumber();

    public String initNumber();

    public void validateNumber(int number);

    public boolean validateSize();
}
