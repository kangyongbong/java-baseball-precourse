package baseball.controller;

import baseball.service.BaseBallService;
import baseball.service.RandomGeneratorService;
import baseball.service.impl.BaseBallServiceImpl;
import baseball.service.impl.RandomGeneratorServiceImpl;

public class BaseBallController {

    private BaseBallService baseBallService;
    private RandomGeneratorService randomGeneratorService;

    public void play(){
        baseBallService = new BaseBallServiceImpl();
        randomGeneratorService = new RandomGeneratorServiceImpl();

        do{
            baseBallService.run(randomGeneratorService.generatorNumber());
        }while (baseBallService.reRun());
    }
}
