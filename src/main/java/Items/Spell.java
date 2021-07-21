package Items;

public enum Spell {
    HEAL (20, 10),
    FIREBALL(-30, 25),
    LIGHTNING(-25, 20);

    private final int value;
    private final int cost;

    Spell(int value, int cost) {
        this.value = value;
        this.cost = cost;
    }

    public int getValue() {
        return value;
    }

    public int getCost(){
        return cost;
    }
}
