package observer2;

import java.util.Comparator;
import java.util.Observable;
import java.util.Observer;
import java.util.PriorityQueue;

public class MyPriorityQueue<T> implements Observer {

    PriorityQueue<T> q;

    public MyPriorityQueue(Comparator<T> c)  {
        q = new PriorityQueue<>(c);
    }
    public void add(T t){
        if (t instanceof Observable){
            Observable o = (Observable)  t;
            o.addObserver(this);
        }
        q.add(t);
    }
    public boolean isEmpty(){
        return q.isEmpty();
    }
    public T poll(){
        return q.poll();
    }

    @Override
    public void update(Observable o, Object arg) {
        q.remove(o);
        q.add((T) o);
    }
}
