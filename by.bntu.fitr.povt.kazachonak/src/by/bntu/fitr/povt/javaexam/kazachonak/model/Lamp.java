package by.bntu.fitr.povt.javaexam.kazachonak.model;

public class Lamp extends Equip{
    
    public Lamp(int power) {
        super("Lamp", power);
    }

    @Override
    public String toString() {
        return name + " " + super.getPower() + " volt.";
    }
    
    
    
} 
