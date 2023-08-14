package decorator;

public class Onion extends FoodDecorator{

    public Onion(Food f) {
        super(f);
    }
    @Override
    public int getCalories(){
        return f.getCalories()+30;
    }
    @Override
    public int getPrice(){
        return f.getPrice()+3;
    }
}
