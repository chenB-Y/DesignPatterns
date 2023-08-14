package adapter;
// object adapter use when we don't want to use the protected / private method
public class TaskRunnable implements  Runnable{
    Task t;

    public TaskRunnable(Task t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.doTask();
    }
}
