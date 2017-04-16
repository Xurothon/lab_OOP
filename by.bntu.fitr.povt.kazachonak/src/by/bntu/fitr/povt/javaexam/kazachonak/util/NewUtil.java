package by.bntu.fitr.povt.javaexam.kazachonak.util;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import by.bntu.fitr.povt.javaexam.kazachonak.model.ModernRoom;
import by.bntu.fitr.povt.javaexam.kazachonak.model.Radio;
import java.util.Random;

public class NewUtil {

    public static int randomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    public static ModernRoom createEquip(ModernRoom modernRoom, int numberEquips) {
        String thing[] = {"TVset", "Computer", "Lamp", "Microwave"};

        for (int i = 0; i < numberEquips; i++) {
            Equip equips[] = {new Equip(thing[randomInt(0, 4)], randomInt(30, 200)),
                new Radio(randomInt(500, 2000), "bad sound")};

            modernRoom.add(equips[randomInt(0, 2)]);
        }
        return modernRoom;
    }
}
