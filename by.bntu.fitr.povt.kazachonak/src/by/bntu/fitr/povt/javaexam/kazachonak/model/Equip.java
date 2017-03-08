package by.bntu.fitr.povt.javaexam.kazachonak.model;

public class Equip {

    private final int power;
    final String name;

    public Equip(String name, int power) {
        this.power = power;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "\tPower of equipment: " + power + " volt";
    }

    public int getEquip() {
        return power;
    }

    public String getName() {
        return name;
    }
}
