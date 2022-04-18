package baseball.service.impl;

import baseball.constant.ErrorMessage;
import baseball.service.ExceptionService;

public class ExceptionServiceImpl implements ExceptionService {

    @Override
    public void inputException(ErrorMessage errorMessage) {
        System.out.println(errorMessage.getMessage());
        throw new IllegalArgumentException(errorMessage.getMessage());
    }
}
