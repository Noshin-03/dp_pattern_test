package flyweight;

public class FlyweightDemo {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        String document = "ABACABA";

        for (int i = 0; i < document.length(); i++) {
            char c = document.charAt(i);
            Character character = factory.getCharacter(c);
            character.display(i, 10); // x = i, y = 10
        }
    }
}
