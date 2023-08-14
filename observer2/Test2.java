package observer2;

import java.util.PriorityQueue;

public class Test2 {
    public static void main(String[] args) {
        MyPriorityQueue<A> q = new MyPriorityQueue<>((a1,a2)->a1.get()-a2.get());

        q.add(new A(5));
        A a = new A(10);

        q.add(a);
        a.setX(2);

        q.add(new A(20));

        while(! q.isEmpty()){
            System.out.println(q.poll().get());
        }
    }
}
