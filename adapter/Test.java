package adapter;

public class Test {
    public static void main(String[] args) {
        Thread t = new Thread(new TaskRunnable(new CodeExectureTask()));
        t.start();

    }
}
