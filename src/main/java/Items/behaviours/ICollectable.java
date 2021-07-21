package Items.behaviours;

import Items.Collectable;

public interface ICollectable {

    public void pickUp(ICollectable collectable);
    public void drop(ICollectable collectable);
}
