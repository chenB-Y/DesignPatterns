package abstractFactory;

public class PlainSword implements Sword{

    @Override
    public void slash() {
        System.out.println("plain sword slash");
    }
}
