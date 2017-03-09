package by.bntu.fitr.povt.javaexam.kazachonak.model;

import by.bntu.fitr.povt.javaexam.kazachonak.model.collection.ICollection;
import by.bntu.fitr.povt.javaexam.kazachonak.model.collection.MyStack;

public class ModernRoom {

    private ICollection<Equip> modernRoom;

    public ModernRoom() {
        modernRoom = new MyStack<>();
    }

    public ModernRoom(ICollection<Equip> other) {
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

//    public Equip[] toArray() {
//        return modernRoom.toArray(new Equip[modernRoom.size()]);
//    }
//
//   public String toString() {
//        Node temp = head;
//        StringBuilder str = new StringBuilder("Queue: ").append("\n");
//        while (null != temp) {
//            str.append(temp.toString()).append("\n");
//            temp = temp.next;
//        }
//        return str.toString();

}
