package decorator;

public class FoodDecorator implements Food{

    Food f;

    public FoodDecorator(Food f) {
        this.f = f;
    }

    @Override
    public int getCalories() {
        return f.getCalories();
    }

    @Override
    public int getPrice() {
        return f.getPrice();
    }
    // if the interface Food was had more function, this class was written them. else hamburger and pizza was must do it.
}
