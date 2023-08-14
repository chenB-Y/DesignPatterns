package decorator;

public class Test {
    public static void main(String[] args) {
        Food f0 = new Tomato(new Onion(new Pizza()));
        System.out.println("calories: " + f0.getCalories());
        System.out.println("price: " + f0.getPrice());
            // the user can put what ever he wants to
        Food f1 = new Onion(new Pizza());
        System.out.println("calories: " + f1.getCalories());
        System.out.println("price: " + f1.getPrice());
            // the order is doesn't matter. that is ok if the order of create doesnt matter
        Food f2 = new Onion(new Tomato(new Pizza()));
        System.out.println("calories: " + f2.getCalories());
        System.out.println("price: " + f2.getPrice());
    }
}
