package observer;

import java.util.Observable;
import java.util.Observer;
import java.util.function.Consumer;

public class Property<T> extends Observable implements Observer {
    T val;
    private Consumer<T> consumer;

    @Override
    public void update(Observable o, Object arg) {
        Property<T> p = (Property<T>) o;
        set(p.get());
    }

    public void bindTo(Property<T> p){
        p.addObserver(this);
    }

    public void bind(Property<T> p){
        this.bindTo(p);
        p.bindTo(this);
    }
    public void set(T v){
        if (val != v) {
            val = v;
            if (consumer != null)
                 consumer.accept(val);
            setChanged();
            notifyObservers();
        }
    }
    public T get(){
        return val;
    }

    public void onChange(Consumer<T> c){
        this.consumer = c;
    }
}
