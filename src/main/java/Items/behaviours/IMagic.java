package Items.behaviours;

import Items.Spell;

public interface IMagic {
    public void cast(Spell spell, Character target);
    public int getMana();
    public void setMana(int manaLevel);
}
