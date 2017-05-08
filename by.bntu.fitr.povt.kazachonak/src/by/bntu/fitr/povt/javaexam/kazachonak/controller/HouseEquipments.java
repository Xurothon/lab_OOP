package by.bntu.fitr.povt.javaexam.kazachonak.controller;

import by.bntu.fitr.povt.javaexam.kazachonak.model.ModernRoom;
import by.bntu.fitr.povt.javaexam.kazachonak.model.logic.PowerCalc;
import by.bntu.fitr.povt.javaexam.kazachonak.model.logic.Sorter;
import by.bntu.fitr.povt.javaexam.kazachonak.util.NewUtil;
import by.bntu.fitr.povt.javaexam.kazachonak.view.ConsolePrint;
import by.bntu.fitr.povt.javaexam.kazachonak.view.PrintManager;
import by.bntu.fitr.povt.javaexam.kazachonak.view.Printable;

public class HouseEquipments {

    public static void main(String[] args) {
        ModernRoom modernRoom = new ModernRoom();
        NewUtil.createEquip(modernRoom, 3);
        System.out.println(modernRoom);
        int power = PowerCalc.calcPower(modernRoom);
        System.out.println("All power: " + power);
        Sorter.sort(modernRoom, Sorter.TypeSort.BY_POWER_DESC);
        System.out.println(modernRoom);
        
        Printable view = PrintManager.get("File");
        view.print(modernRoom);
    }
}
