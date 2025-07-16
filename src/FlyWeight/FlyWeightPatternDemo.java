package FlyWeight;

import java.util.ArrayList;
import java.util.List;

public class FlyWeightPatternDemo {
    public static void main(String[] args) {
        List<FormattedCharacter> document = new ArrayList<>();

        TextFormat boldArial = TextFormatFactory.getTextFormat("Arial", 12, "Bold");
        TextFormat italicTimes = TextFormatFactory.getTextFormat("Times", 12, "Italic");

        document.add(new FormattedCharacter('H', boldArial));
        document.add(new FormattedCharacter('e', boldArial));
        document.add(new FormattedCharacter('l', boldArial));
        document.add(new FormattedCharacter('l', italicTimes));
        document.add(new FormattedCharacter('o', italicTimes));

        for (FormattedCharacter fc : document) {
            fc.print();
        }
    }
}

