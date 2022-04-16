package baseball.service.impl;

import baseball.constant.ErrorMessage;
import baseball.service.ExceptionService;

public class ExceptionServiceImpl implements ExceptionService {

    @Override
    public void countOverException() {
        System.out.println(ErrorMessage.INPUT_COUNT.getMessage());
        throw new IllegalArgumentException(ErrorMessage.INPUT_COUNT.getMessage());
    }

    @Override
    public void rangeException() {
        System.out.println(ErrorMessage.INPUT_RANGE.getMessage());
        throw new IllegalArgumentException(ErrorMessage.INPUT_RANGE.getMessage());
    }

    @Override
    public void distinctException() {
        System.out.println(ErrorMessage.INPUT_DISTINCT.getMessage());
        throw new IllegalArgumentException(ErrorMessage.INPUT_DISTINCT.getMessage());
    }

    @Override
    public void restartException() {
        System.out.println(ErrorMessage.INPUT_RESTART.getMessage());
        throw new IllegalArgumentException(ErrorMessage.INPUT_RESTART.getMessage());
    }

    @Override
    public void emptyException() {
        System.out.println(ErrorMessage.INPUT_EMPTY.getMessage());
        throw new IllegalArgumentException(ErrorMessage.INPUT_EMPTY.getMessage());
    }

    @Override
    public void characterException() {
        System.out.println(ErrorMessage.INPUT_CHARACTER.getMessage());
        throw new IllegalArgumentException(ErrorMessage.INPUT_CHARACTER.getMessage());
    }
}
