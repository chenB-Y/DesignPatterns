package observer2;

import java.util.Observable;

public class A extends Observable {
    int x;
    public A(int x){ this.x = x;}
    public void setX(int x){
        this.x = x;
        setChanged();
        notifyObservers();
    }
    public int get(){ return x;}
}
