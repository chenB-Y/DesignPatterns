package adapter;

public class CodeExectureTask implements Task{
    protected void preCompile(){ }
    protected void compile() { }
    protected void execute() { }
    @Override
    public void doTask(){
        execute();
    }
}
