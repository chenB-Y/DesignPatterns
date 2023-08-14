package flyweight_Builder;

public class CharacterBuilder {
        char letter;
        String font;
        String color;
        int size;

        public CharacterBuilder(Character c) {
            this.letter = c.letter;
            this.font = c.font;
            this.color = c.color;
            this.size = c.size;
        }

        public CharacterBuilder setLetter(char letter) {
            this.letter = letter;
            return this;
        }

        public CharacterBuilder setFont(String font) {
            this.font = font;
            return this;
        }

        public CharacterBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CharacterBuilder setSize(int size) {
            this.size = size;
            return this;
        }
        public Character build(FlyWeightFactory f){
            return f.get(letter + "," + font + "," + color + "," + size);
        }
}
