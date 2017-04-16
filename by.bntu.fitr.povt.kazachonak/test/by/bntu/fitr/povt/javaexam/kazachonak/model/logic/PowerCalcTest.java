package by.bntu.fitr.povt.javaexam.kazachonak.model.logic;

import by.bntu.fitr.povt.javaexam.kazachonak.model.ModernRoom;
import by.bntu.fitr.povt.javaexam.kazachonak.model.Radio;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerCalcTest {

    private ModernRoom modernRoom = null;

    public PowerCalcTest() {
    }

    @Before
    public void setUp() {
        modernRoom = new ModernRoom();
    }

    @After
    public void tearDown() {
        modernRoom = null;
    }

    @Test
    public void testCalcPower() {
        Radio r1 = new Radio(150, "cool sound");
        Radio r2 = new Radio(100, "bad sound");
        modernRoom.add(new Radio(150, "cool sound"));
        modernRoom.add(new Radio(100, "bad sound"));
        int total = r1.getPower() + r2.getPower();

        assertEquals(total, PowerCalc.calcPower(modernRoom));
    }

}
