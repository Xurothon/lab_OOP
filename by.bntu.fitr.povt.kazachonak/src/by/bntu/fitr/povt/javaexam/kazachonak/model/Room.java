package by.bntu.fitr.povt.javaexam.kazachonak.model;

public class Room {

    private String name;
    private final Equip[] equip;

    public Room(String name, Equip[] equip) {
        this.name = name;
        this.equip = equip;
    }

    public String getName() {
        return name;
    }

    public Equip[] getEquip() {
        return equip;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String str = name + '\n';
        for (Equip equips : equip) {
            str += '\t' + equips.toString() + '\n';
        }
        return str;
    }
}
