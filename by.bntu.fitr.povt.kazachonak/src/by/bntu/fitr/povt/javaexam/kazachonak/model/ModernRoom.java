package by.bntu.fitr.povt.javaexam.kazachonak.model;

import by.bntu.fitr.povt.javaexam.kazachonak.model.collection.MyStack;
import by.bntu.fitr.povt.javaexam.kazachonak.model.collection.MyCollection;

public class ModernRoom {

    private MyCollection<Equip> modernRoom;

    public ModernRoom() {
        modernRoom = new MyStack<>();
    }

    public ModernRoom(MyCollection<Equip> other) {
        modernRoom = other;
    }

    public void push(Equip equip) {
        modernRoom.push(equip);
    }

//    public void clear() {
//        modernRoom.clear();
//    }

    public Equip pop() {
        return modernRoom.pop();
    }

    public Equip peek() {
        return modernRoom.peek();
    }

}
