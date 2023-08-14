package observer2;

import java.util.Collection;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ObservableCollection<A> c = new ObservableCollection<A>(new LinkedList<A>());
        c.add(new A(0));
        c.add(new A(1));
        c.add(new A(2));

        A a = new A(3);

        c.onChange((Collection<A> col )-> {
            System.out.println("list changed");
            col.forEach(e-> System.out.println(e.get()));
            System.out.println();
        });

        c.add(a);
        a.setX(5);
        c.remove(a);
    }
}
