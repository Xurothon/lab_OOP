package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import by.bntu.fitr.povt.javaexam.kazachonak.model.Radio;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

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
        String s = "\nRadio 50 volt and bad sound.";
        assertEquals(s, equip.toString());
    }
    
    @Ignore
    @Test(timeout = 15000)
    public void pushAndPopSpeed() {
        System.out.println("pushAndPopSpeed");
        for (int i = 0; i < 1_000_000_0; i++) {
            equip.push(new Radio(50, "bad sound."));
        }
        for (int i = 0; i < equip.size(); i++) {
            equip.pop();
        }
    }

}
