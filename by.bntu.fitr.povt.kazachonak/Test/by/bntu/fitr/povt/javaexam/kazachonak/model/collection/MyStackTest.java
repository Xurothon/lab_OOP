package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import by.bntu.fitr.povt.javaexam.kazachonak.model.Radio;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {

    private static MyStack<Equip> equip = null;

    @BeforeClass
    public static void makeStack() {
        equip = new MyStack<>();
        equip.push(new Radio(50, "bad sound."));
        equip.push(new Radio(100, "good sound."));
    }

    @AfterClass
    public static void tearDownClass() {
        equip = null;
    }

    @Test
    public void testPush() {
        int size = 2;
        equip.push(new Radio(40, "not sound."));
        assertEquals(size, equip.size());
    }

    @Test
    public void testPop() {
        int size = 1;
        equip.pop();
        assertEquals(size, equip.size());
    }

    @Test
    public void testToString() {
        testPop();
        String s = "Radio 50 volt and bad sound.";
        assertEquals(s, equip.toString());
    }
}
