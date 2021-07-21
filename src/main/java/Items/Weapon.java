package Items;

public enum Weapon {
    AXE(8),
    SWORD(7),
    STAFF(4),
    CLUB(5),
    HAMMER(9);

    private final int damage;

    Weapon(int damage){
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}

