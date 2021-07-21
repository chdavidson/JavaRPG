package Player;


import Items.Armour;
import Items.Weapon;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf testDwarf;

    @Before
    public void setUp(){
        testDwarf = new Dwarf("Gimli");
    }

    @Test
    public void dwarfHasName(){
        assertEquals("Gimli", testDwarf.getName());
    }

    @Test
    public void dwarfHasHP(){
        assertEquals(80, testDwarf.getHealthPoints());
    }

    @Test
    public void dwarfHasHammer(){
        testDwarf.equip(Weapon.HAMMER);
        assertEquals(Weapon.HAMMER, testDwarf.getWeapon());
    }

    @Test
    public void dwarfHasHeavyArmour(){
        testDwarf.setArmour(Armour.HEAVY);
        assertEquals(Armour.HEAVY, testDwarf.getArmour());
    }

//    @Test
//    public void dwarfCanBlock(){
//        testDwarf.setArmour(Armour.HEAVY);
//        assertEquals(10, testDwarf.block(20););
//    }
}