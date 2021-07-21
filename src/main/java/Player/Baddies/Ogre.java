package Player.Baddies;

import Items.Weapon;
import Player.Character;

public class Ogre extends Character {


    public Ogre(String name) {
        super(name);
        this.setHealthPoints(300);
        this.equip(Weapon.CLUB);
    }





}
