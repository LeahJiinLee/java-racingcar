package racingcar.step3.service;

import racingcar.step3.domain.Cars;
import racingcar.step3.move.Moving;

public class RacingGame {

    private static final int COUNT_OF_TRY_MIN_NUM = 1;
    private int countOfTry;
    private Cars cars;

    public RacingGame(int countOfTry, int countOfCar) {
        countOfTryCheck(countOfTry);
        this.countOfTry = countOfTry;
        this.cars = new Cars(countOfCar);
    }

    public boolean isEndGame() {
        return countOfTry == 0;
    }

    public void race(Moving moving) {
        cars.moveCars(moving);
        countOfTry--;
    }

    public int getCountOfTry() {
        return countOfTry;
    }

    public Cars getCars() {
        return cars;
    }

    private static void countOfTryCheck(int countOfTry) {
        if (countOfTry < COUNT_OF_TRY_MIN_NUM) {
            throw new IllegalArgumentException("0 이하 값은 불가능 합니다.");
        }
    }

}
