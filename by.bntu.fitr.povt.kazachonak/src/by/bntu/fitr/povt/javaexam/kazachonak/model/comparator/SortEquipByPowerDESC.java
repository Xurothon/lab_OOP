package by.bntu.fitr.povt.javaexam.kazachonak.model.comparator;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import java.util.Comparator;

public class SortEquipByPowerDESC implements Comparator<Equip> {

    @Override
    public int compare(Equip o1, Equip o2) {
        return Integer.compare(o2.getPower(), o1.getPower());
    }
}
