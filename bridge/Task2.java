package bridge;

import java.sql.Struct;

public class Task2 implements Task {
    @Override
    public void doTask(Logger l) {
        l.writeToLog("some log entry");
        l.writeToLog("some other log entry");

    }
}
