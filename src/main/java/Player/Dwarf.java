package Player;

import Items.Armour;
import Items.behaviours.IArmour;

public class Dwarf extends Character implements IArmour {

    private Armour armour;

    public Dwarf(String name) {
        super(name);
        this.setHealthPoints(80);
    }


    public void setArmour(Armour armour) {
        this.armour = armour;
    }


    public Armour getArmour() {
        return armour;
    }
}
