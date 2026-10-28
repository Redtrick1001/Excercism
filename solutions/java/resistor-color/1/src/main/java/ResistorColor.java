import java.util.*;

class ResistorColor {
    Map<String, Integer> colourMappings;

    ResistorColor() {
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

    int colorCode(String color) {
        return colourMappings.get(color);
    }

    String[] colors() {
        return colourMappings.keySet().toArray(new String[0]);
    }
}
