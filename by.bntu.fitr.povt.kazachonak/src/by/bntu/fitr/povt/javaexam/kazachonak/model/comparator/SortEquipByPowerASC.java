package by.bntu.fitr.povt.javaexam.kazachonak.model.comparator;

import by.bntu.fitr.povt.javaexam.kazachonak.model.Equip;
import java.util.Comparator;

public class SortEquipByPowerASC implements Comparator<Equip> {

    @Override
    public int compare(Equip o1, Equip o2) {
        return Integer.compare(o1.getPower(), o2.getPower());
    }
}
