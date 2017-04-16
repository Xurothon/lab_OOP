package by.bntu.fitr.povt.javaexam.kazachonak.controller;

import by.bntu.fitr.povt.javaexam.kazachonak.model.ModernRoom;
import by.bntu.fitr.povt.javaexam.kazachonak.model.logic.PowerCalc;
import by.bntu.fitr.povt.javaexam.kazachonak.model.logic.Sorter;
import by.bntu.fitr.povt.javaexam.kazachonak.util.NewUtil;
import by.bntu.fitr.povt.javaexam.kazachonak.view.View;

public class HouseEquipments {

    public static void main(String[] args) {
        ModernRoom modernRoom = new ModernRoom();
        NewUtil.createEquip(modernRoom, 3);
        View.view(modernRoom.toString());
        int power = PowerCalc.calcPower(modernRoom);
        System.out.println("\nAll power: " + power + "\n");
        Sorter.sort(modernRoom, Sorter.TypeSort.BY_POWER_DESC);
        View.view(modernRoom.toString());
    }
}
