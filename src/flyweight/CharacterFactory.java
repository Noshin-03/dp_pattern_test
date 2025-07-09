package flyweight;
import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
    private final Map<java.lang.Character, ConcreteCharacter> characters = new HashMap<>();

    public Character getCharacter(char c) {
        if (!characters.containsKey(c)) {
            characters.put(c, new ConcreteCharacter(c));
        }
        return characters.get(c);
    }
}
