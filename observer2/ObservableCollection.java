package observer2;

import java.security.PublicKey;
import java.util.Collection;
import java.util.Observable;
import java.util.Observer;
import java.util.function.Consumer;

public class ObservableCollection <E> implements Observer {

    private Collection<E> col;
    private Consumer<Collection<E>> consumer;
    public ObservableCollection(Collection<E> col) {
        this.col = col;

    }

    @Override
    public void update(Observable o, Object arg) {
        notifyChange();
    }
    public void add(E e){
        col.add(e);
        if (e instanceof Observable){
            Observable o = (Observable) e;
            o.addObserver(this);
        }
        notifyChange();
    }

    public void remove( E e){
        col.remove(e);
        notifyChange();
    }

    private void notifyChange(){
        if (consumer != null)
            consumer.accept(col);
    }

    public void onChange(Consumer<Collection<E>> consumer){
        this.consumer = consumer;
    }
}
