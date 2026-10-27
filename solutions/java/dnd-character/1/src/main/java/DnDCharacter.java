import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class DnDCharacter {

    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    public DnDCharacter() {
        this.charisma = ability(rollDice());
        this.constitution = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.strength = ability(rollDice());
        this.wisdom = ability(rollDice());
    }

    int ability(List<Integer> scores) {
        List<Integer> rolls = Arrays.asList(1,2,3,4);
        Collections.copy(rolls, scores);
        Collections.sort(rolls);
        int total = rolls.get(1) + rolls.get(2) + rolls.get(3);
        return total;
    }

    List<Integer> rollDice() {
        List<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            rolls.add((int) Math.floor((Math.random() * 6) + 1));
        }
        Collections.sort(rolls);
        return rolls;
    }

    int modifier(int input) {
        return (int)Math.floor(input / 2.0) - 5;
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(getConstitution());
    }
}
