package Player;

import Items.Spell;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WizardTest {

    Wizard wizard;
    Dwarf dwarf;

    @Before
    public void setUp(){
        wizard = new Wizard("Harry");
        dwarf = new Dwarf("Big Stupid Idiot");
    }

    @Test
    public void wizardInitialisedWithMana(){
        assertEquals(100, wizard.getMana());
    }

    @Test
    public void wizardCanCastFireball(){
        wizard.cast(Spell.FIREBALL, dwarf);
        assertEquals(50, dwarf.getHealthPoints());
    }

    @Test
    public void wizardCanCastHeal(){
        wizard.cast(Spell.HEAL, dwarf);
        assertEquals(100, dwarf.getHealthPoints());
        assertEquals(90, wizard.getMana());
    }

}