package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import racingcar.domain.Car;
import racingcar.system.SystemConstant;

public class CarMover {

    public static void move(List<Car> carList) {
        carList.stream()
                .filter(i -> isMoving())
                .forEach(Car::move);
    }

    private static boolean isMoving() {
        return Randoms.pickNumberInRange(0, 9) >= SystemConstant.MOVE_STANDARD.getValue();
    }
}
