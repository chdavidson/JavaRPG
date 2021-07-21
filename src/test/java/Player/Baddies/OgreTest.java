package Player.Baddies;

import Items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OgreTest {

    Ogre ogre;

    @Before
    public void setUp(){
        ogre = new Ogre("Craig");

    }

    @Test
    public void OgreInitialises(){
        assertEquals("Craig", ogre.getName());
        assertEquals(300, ogre.getHealthPoints());
        assertEquals(Weapon.CLUB, ogre.getWeapon());
    }

}