package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import by.bntu.fitr.povt.javaexam.kazachonak.model.Radio;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyQueueTest {

    private static MyQueue<Equip> equip = null;

    @BeforeClass
    public static void makeQeue() {
        equip = new MyQueue<>();
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
        int size = 2;
        equip.push(new Radio(40, "not sound."));
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
        testPop();
        String s = "\nRadio 40 volt and not sound.";
        assertEquals(s, equip.toString());
    }

}
