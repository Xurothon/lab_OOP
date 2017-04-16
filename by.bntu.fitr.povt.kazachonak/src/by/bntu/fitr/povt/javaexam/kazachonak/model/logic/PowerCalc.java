package by.bntu.fitr.povt.javaexam.kazachonak.model.logic;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import by.bntu.fitr.povt.javaexam.kazachonak.model.ModernRoom;

public class PowerCalc {

    public static int calcPower(ModernRoom modernRoom) {
        int power = 0;
        for (Equip equip : modernRoom) {
            power += equip.getPower();
        }
        return power;
    }

}
