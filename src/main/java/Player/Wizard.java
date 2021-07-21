package Player;

import Items.Spell;

public class Wizard extends Character {

    private int mana;

    public Wizard(String name) {
        super(name);
        this.mana = 100;
    }

    public void cast(Spell spell, Character target) {
        target.setHealthPoints(target.getHealthPoints() + spell.getValue());
        this.mana -= spell.getCost();
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
