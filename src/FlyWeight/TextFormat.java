package FlyWeight;

public class TextFormat {
    private String font;
    private int size;
    private String style;

    public TextFormat(String font, int size, String style) {
        this.font = font;
        this.size = size;
        this.style = style;
    }

    public String getFont() {
        return font;
    }

    public int getSize() {
        return size;
    }

    public String getStyle() {
        return style;
    }
}

