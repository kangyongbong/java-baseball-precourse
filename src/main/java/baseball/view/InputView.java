package baseball.view;

import baseball.constant.GameMessageConstant;
import nextstep.utils.Console;

public class InputView {

    public String input(){
        System.out.println(GameMessageConstant.INPUT_MSG);
        return Console.readLine();
    }

    public String reStart(){
        System.out.println(GameMessageConstant.CONTINUE_MSG);
        return Console.readLine();
    }
}
