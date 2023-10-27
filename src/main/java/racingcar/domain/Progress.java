package racingcar.domain;

import racingcar.system.SystemConstant;

public class Progress {
    private int progress;

    Progress() {
        progress = SystemConstant.INITIAL_PROGRESS_NUMBER.getValue();
    }

    void up() {
        progress++;
    }

    int get() {
        return progress;
    }
}
