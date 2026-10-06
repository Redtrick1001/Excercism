class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    boolean isVulnerable() {
        return false;
    }

    public int getDamagePoints(Fighter fighter) {
        return fighter.isVulnerable() ? 10: 6;
    }
}

class Wizard extends Fighter {
    public boolean isPreparingSpells = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public boolean isVulnerable() {
        return !this.isPreparingSpells;
    }

    public void prepareSpell() {
        this.isPreparingSpells = true;
    }

    public int getDamagePoints(Fighter fighter) {
        return this.isPreparingSpells ? 12: 3;
    }
}

