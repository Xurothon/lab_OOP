package by.bntu.fitr.povt.javaexam.kazachonak.util;


import by.bntu.fitr.povt.javaexam.kazachonak.model.Room;
import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import java.util.Random;

public class Util {
private static final Random rand = new Random();
    private static final String[] names = { "Television set", "Computer", "Lamp\t", "Microwave"};
	  private static String[] new_names = { "Big", "Small", "Normal" };
    private static final String[] room_names = { "Kitchen", "Bedroom", "Living room", "Retting room" };
    private static final int max_equips = 10;
    private static final int max_rooms = 7;
    
    private static String getString(String[] array)
    {
        return array[rand.nextInt(array.length)];
    }
    
    public static String getEquipName()
    {
        return getString(names);
    }
	
	    public static String getName()
    {
        return getString(new_names);
    }
    
        public static Equip getEquip()
    {
        Equip equip;
        String name = getEquipName();
            equip = new Equip(name, rand.nextInt(max_equips+1980));
  
        return equip;
    }
    
    public static Equip[] getEquips()
    {
        int count = rand.nextInt(max_equips)+1;
        Equip[] equip = new Equip[count];
        for (int i = 0; i < count; ++i)
        {
            equip[i] = getEquip();
        }
        return equip;
    }
    
    public static String getRoomName()
    {
        return getString(room_names);
    }
    
     public static Room getRoom()
    {
        return new Room(getRoomName(), getEquips());
    }
    
    public static Room[] getRooms()
    {
        Room[] rooms = new Room[room_names.length];
        for (int i = 0; i < rooms.length; ++i)
        {
            rooms[i] = new Room(room_names[i], getEquips());
        }
        return rooms;
    }
}