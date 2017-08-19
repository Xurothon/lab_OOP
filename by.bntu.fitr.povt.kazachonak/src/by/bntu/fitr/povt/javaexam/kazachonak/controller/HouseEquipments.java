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
        Printable view = PrintManager.get("Console");
        view.print(modernRoom);
        view.print("\n");
        int power = PowerCalc.calcPower(modernRoom);
        view.print("All power: ");
        view.print(power);
        view.print("\n");
        view.print("Sort_by_power_DESC");
        view.print("\n");
        Sorter.sort(modernRoom, Sorter.TypeSort.BY_POWER_DESC);
        System.out.println(modernRoom);
        view.print("Log4j - D:\\\\test.log");
        view.print("\n");
        view.print("FileOutput - D:\\outputfile.txt");
        view.print("\n");
        view = PrintManager.get("File");
        view.print(modernRoom);
        
    }
}
