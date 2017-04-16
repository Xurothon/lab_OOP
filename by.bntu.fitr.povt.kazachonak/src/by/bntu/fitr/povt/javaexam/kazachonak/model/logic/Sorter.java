package by.bntu.fitr.povt.javaexam.kazachonak.model.logic;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import by.bntu.fitr.povt.javaexam.kazachonak.model.ModernRoom;
import by.bntu.fitr.povt.javaexam.kazachonak.model.comparator.SortEquipByPowerASC;
import by.bntu.fitr.povt.javaexam.kazachonak.model.comparator.SortEquipByPowerDESC;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter {

    public static void sort(ModernRoom modernRoom, TypeSort typeSort) {
        Comparator comparator = null;
        switch (typeSort) {
            case BY_POWER_ASC:
                comparator = new SortEquipByPowerASC();
                break;
            case BY_POWER_DESC:
                comparator = new SortEquipByPowerDESC();
                break;
        }
        Collections.sort((List<Equip>) modernRoom.getList(), comparator);
    }

    public enum TypeSort {
        BY_POWER_ASC, BY_POWER_DESC;
    }

}
