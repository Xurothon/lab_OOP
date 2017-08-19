package by.bntu.fitr.povt.javaexam.kazachonak.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ModernRoom implements Iterable<Equip> {

    private final List<Equip> modernRoom;

    public ModernRoom() {
        modernRoom = new LinkedList<>();
    }

    public ModernRoom(List<Equip> other) {
        modernRoom = other;
    }

    public void add(Equip equip) {
        modernRoom.add(equip);
    }

    public Equip get(int index) {
        return modernRoom.get(index);
    }

    public List<Equip> getList() {
        return modernRoom;
    }

    public Equip remove(int index) {
        return modernRoom.remove(index);
    }

    public void clear() {
        modernRoom.clear();
    }

    public int size() {
        return modernRoom.size();
    }

    public Equip[] toArray() {
        return modernRoom.toArray(new Equip[modernRoom.size()]);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Equip equip : modernRoom) {
            s.append(equip).append("\n");
        }
        s.replace(s.length() - 2, s.length(), "");
        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModernRoom)) {
            return false;
        }
        ModernRoom modernRoom1 = (ModernRoom) o;
        return modernRoom != null ? modernRoom.equals(modernRoom1.modernRoom) : modernRoom1.modernRoom == null;
    }

    @Override
    public int hashCode() {
        return modernRoom != null ? modernRoom.hashCode() : 0;
    }

    @Override
    public Iterator<Equip> iterator() {
        return modernRoom.iterator();
    }
}
