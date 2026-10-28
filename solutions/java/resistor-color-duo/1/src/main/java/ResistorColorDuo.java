import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

class ResistorColorDuo {
    Map<String, Integer> colourMappings;

    ResistorColorDuo() {
        this.colourMappings = new LinkedHashMap<>();
        colourMappings.put("black", 0);
        colourMappings.put("brown", 1);
        colourMappings.put("red", 2);
        colourMappings.put("orange", 3);
        colourMappings.put("yellow", 4);
        colourMappings.put("green", 5);
        colourMappings.put("blue", 6);
        colourMappings.put("violet", 7);
        colourMappings.put("grey", 8);
        colourMappings.put("white", 9);
    }

    int value(String[] colors) {
        String[] usedColors = {colors[0], colors[1]};
        StringBuilder total = new StringBuilder();
        for (String color: usedColors) {
            total.append(colourMappings.get(color));
        }
        return Integer.parseInt(total.toString());
    }
}
