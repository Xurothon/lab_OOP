package by.bntu.fitr.povt.javaexam.kazachonak.model;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PowerCalcTest {
    private static Room[] rooms = null;
    
    @BeforeClass
    public static void setUpClass() {
        rooms = UtilTest.getRooms();
    }
    
    @AfterClass
    public static void tearDownClass() {
        rooms = null;
    }
    
    @Test
    public void testCalcPower() {
         int power = 0;
        for (Room room : rooms)
        {
            power = PowerCalc.calcPower(room);
        }  
        int expResult = 10;
        assertEquals(expResult, power);
    }
    
    @Test
    public void testToString() {
        String expResult = "Kitchen\n\tComputer\tPower of equipment: 10 volt\n";
        assertEquals(expResult, rooms[1].toString());
         
    }
}
