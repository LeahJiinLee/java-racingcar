package racingcar.step3.domain;

import racingcar.step3.move.Moving;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final int COUNT_OF_CAR_MIN_NUM = 1;
    private List<Car> cars = new ArrayList<>();

    public Cars(int countOfCar) {
        countOfCarCheck(countOfCar);
        for (int i = 0; i < countOfCar; i++) {
            cars.add(new Car());
        }
    }

    public void moveCars(Moving moving) {
        for (Car car : cars) {
            car.move(moving);
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    private static void countOfCarCheck(int countOfCar) {
        if (countOfCar < COUNT_OF_CAR_MIN_NUM) {
            throw new IllegalArgumentException("0이하 값은 불가능 합니다.");
        }
    }

}
