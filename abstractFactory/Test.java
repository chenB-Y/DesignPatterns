package abstractFactory;

public class Test {
    public static void main(String[] args) {
        GAFactory f = new GAFactory("starwarArmory.txt");
        Sword s = f.get("Sword");
        s.slash();
        Shield sh = f.get("Shield");
        sh.defend();
    }
}
