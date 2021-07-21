package Items;

public enum Armour {

    HEAVY(10),
    LIGHT(5),
    SEXY(1);

    private final int armourValue;

    Armour(int armourValue) {
        this.armourValue = armourValue;
    }

    public int getArmourValue() {
        return armourValue;
    }
}
