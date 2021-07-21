package Player;

import Items.behaviours.ICollectable;
import Items.Weapon;

import java.util.HashMap;

public abstract class Character {

    private String name;
    private int healthPoints;
    private Weapon weapon;

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    private HashMap<ICollectable, Integer> inventory;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void attack(Character enemy){
        //do a fight;
    }

    public void equip(Weapon newWeapon){
        this.weapon = newWeapon;
    }
}



