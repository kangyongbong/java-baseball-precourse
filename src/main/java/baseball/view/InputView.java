package baseball.view;

import baseball.constant.ViewMessage;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputNumber(){
        System.out.print(ViewMessage.INPUT_NUMBER.getMessage());
        return Console.readLine();
    }

    public String inputRestart(){
        System.out.print(ViewMessage.RESTART.getMessage());
        return Console.readLine();
    }
}
