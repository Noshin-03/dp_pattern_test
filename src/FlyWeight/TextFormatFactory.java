package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class TextFormatFactory {
    private static Map<String, TextFormat> formatMap = new HashMap<>();

    public static TextFormat getTextFormat(String font, int size, String style) {
        String key = font + "-" + size + "-" + style;
        if (!formatMap.containsKey(key)) {
            formatMap.put(key, new TextFormat(font, size, style));
        }
        return formatMap.get(key);
    }
}

