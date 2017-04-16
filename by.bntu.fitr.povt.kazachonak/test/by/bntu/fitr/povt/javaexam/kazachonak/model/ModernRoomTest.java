package by.bntu.fitr.povt.javaexam.kazachonak.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModernRoomTest {

    private ModernRoom modernRoom = null;

    public ModernRoomTest() {
    }

    @Before
    public void setUp() {
        modernRoom = new ModernRoom();
        Equip r1 = new Radio(100, "bad sound");
        Equip r2 = new Radio(150, "cool sound");
        modernRoom.add(r2);
        modernRoom.add(r1);
    }

    @After
    public void tearDown() {
        modernRoom = null;
    }

    @Test
    public void testAdd() {
        int size = modernRoom.size();
        assertEquals(size, modernRoom.size());
        Radio r1 = new Radio(100, "bad sound");
        modernRoom.add(r1);
        size++;
        assertEquals(size, modernRoom.size());
    }

    @Test
    public void testRemove() {
        int size = modernRoom.size();
        System.out.println(size);
        Equip radio = modernRoom.get(0);
        assertEquals(radio, modernRoom.remove(0));
        size--;
        assertEquals(size, modernRoom.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testClear() {
        modernRoom.clear();
        modernRoom.remove(0);
    }

    @Test
    public void testToString() {
        modernRoom.clear();
        Equip r1 = new Radio(100, "bad sound");
        Equip r2 = new Radio(150, "cool sound");
        modernRoom.add(r2);
        modernRoom.add(r1);
        String str = r2.toString() + ", " + r1.toString(); 
        assertEquals(str, modernRoom.toString());
    }
}
