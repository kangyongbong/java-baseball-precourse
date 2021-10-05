package baseball.service;

public interface JudgmentService {

    public boolean judgment(String random, String inputNumber);

    public void isStrike(String random, String input);

    public void isBall(String random, String input, int i);

    public boolean validateGame();

    public boolean validateEndGame();

    public void resultMsg();

    public void nothingMsg();

    public void strikeMsg();

    public void ballMsg();

    public void strikeAndBallMsg();
}
