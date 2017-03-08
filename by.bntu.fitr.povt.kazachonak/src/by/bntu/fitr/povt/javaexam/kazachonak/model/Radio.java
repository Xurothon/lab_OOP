package by.bntu.fitr.povt.javaexam.kazachonak.model;

public class Radio extends Equip {

    final String other;

    public Radio(int power, String other) {
        super("Radio", power);
        this.other = other;
    }

    @Override
    public String toString() {
        return name + " " + super.getEquip() + " volt and " + other;
    }
}
