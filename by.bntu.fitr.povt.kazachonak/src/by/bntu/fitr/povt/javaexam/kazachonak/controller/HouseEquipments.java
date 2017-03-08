package by.bntu.fitr.povt.javaexam.kazachonak.controller;

import by.bntu.fitr.povt.javaexam.kazachonak.model.PowerCalc;
import by.bntu.fitr.povt.javaexam.kazachonak.model.Room;
import by.bntu.fitr.povt.javaexam.kazachonak.util.Util;
import by.bntu.fitr.povt.javaexam.kazachonak.view.View;


public class HouseEquipments {
    public static void main(String[] args) {
        Room[] rooms = Util.getRooms();
        for (Room room : rooms)
        {
            View.view(room.toString());
            int power = PowerCalc.calcPower(room);
            View.view("Power of equipment: " + power + " volt.\n");
        }  
    }
}