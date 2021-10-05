package baseball.service;

public interface BaseBallService {

    public void run(String random);

    public boolean baseBall(String random, String input);

    public boolean reRun();

    public boolean validation(String inputNumber);

    public boolean reRunValidation(String inputNumber);

    public boolean judgment(String random, String inputNumber);

    public boolean rsRunJudgment(String inputNumber);
}
