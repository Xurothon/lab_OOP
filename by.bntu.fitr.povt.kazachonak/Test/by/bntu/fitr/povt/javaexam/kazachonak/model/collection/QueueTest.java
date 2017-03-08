package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Radio;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    private static Queue equip = null;

    public QueueTest() {
    }

    @BeforeClass
    public static void setUpClass() {
        equip = new Queue();
        equip.push(new Radio(50, "bad sound."));
        equip.push(new Radio(100, "good sound."));
    }

    @AfterClass
    public static void tearDownClass() {
        equip = null;
    }

    @Test
    public void testPush() {
        System.out.println("push");
        int size = 3;
        equip.push(new Radio(40, "not sound"));
        assertEquals(size, equip.size());
    }

    @Test
    public void testPop() {
        System.out.println("pop");
        int size = 1;
        equip.pop();

        assertEquals(size, equip.size());
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        String s = "\nBoing(capacity - 50, seats - 400), Boing(capacity - 50, seats - 400)";
        System.out.println(equip.toString());
        //assertEquals(s, airline.toString());
    }

}
