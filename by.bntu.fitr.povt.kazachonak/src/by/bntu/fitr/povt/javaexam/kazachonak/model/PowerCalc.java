package by.bntu.fitr.povt.javaexam.kazachonak.model;

public class PowerCalc {

    public static int calcPower(Room room) {
        int power = 0;
        for (Equip equip : room.getEquip()) {
            power += equip.getEquip();
        }
        return power;
    }

}
