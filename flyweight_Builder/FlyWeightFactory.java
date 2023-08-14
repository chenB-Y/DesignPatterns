package flyweight_Builder;

import java.util.HashMap;

public class FlyWeightFactory {
    HashMap<String,Character> map;

    public FlyWeightFactory() {
        this.map = new HashMap<>();
    }
    public Character get(String key){
        if(map.containsKey(key))
            return map.get(key);
        else{
            Character c = new Character(key);
            map.put(key,c);
            return c;
        }
    }
    public CharacterBuilder get(Character c){
        return new CharacterBuilder(c);
    }
}
