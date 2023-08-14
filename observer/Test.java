package observer;

public class Test {
    public static void main(String[] args) {
        Property<Integer> p1 = new Property<>();
        Property<Integer> p2 = new Property<>();
        Property<Integer> p3 = new Property<>();
        Property<Integer> p4 = new Property<>();

        p2.bindTo(p1);
        p3.bindTo(p2);
        p1.bindTo(p3);

        p1.bind(p4);

        p4.onChange(x-> System.out.println("p4's value has changed to "+ x));

        p1.set(100);

        System.out.println("p3's value is "+ p3.get());


    }
}
