package FlyWeight;

public class FormattedCharacter {
    private char character;
    private TextFormat format;

    public FormattedCharacter(char character, TextFormat format) {
        this.character = character;
        this.format = format;
    }

    public void print() {
        System.out.println("Char: " + character +
                " | Format: " + format.getFont() + ", " +
                format.getSize() + "pt, " +
                format.getStyle());
    }
}

