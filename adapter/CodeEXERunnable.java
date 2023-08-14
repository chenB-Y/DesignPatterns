package adapter;
// class adapter use when we want to do the protected method-> we need to do inheritance
public class CodeEXERunnable extends CodeExectureTask implements Runnable{

    @Override
    public void run() {
        preCompile();
        compile();
        execute();
    }
}
