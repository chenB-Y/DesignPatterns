package flyweight_Builder;

public class Character {
    final char letter;
    final String font;
    final String color;
    final int size;

    public Character(String value) {
       String sp[] = value.split(",");
       this.letter = sp[0].charAt(0);
       this.font = sp[1];
       this.color = sp[2];
       size = Integer.parseInt(sp[3]);
    }
    public void paint(int row , int col){
        //paint the character
    }
    public int getSize() {
        return this.size;
    }
}
