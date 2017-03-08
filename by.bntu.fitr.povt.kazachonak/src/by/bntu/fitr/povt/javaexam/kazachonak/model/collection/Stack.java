package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import java.util.NoSuchElementException;

public class Stack<T> extends AList<T> {

    public Stack() {
        first = null;
        n = 0;
    }

    @Override
    public void push(T newObject) {
        Node oldfirst = first;
        first = new Node();
        first.newObject = newObject;
        first.next = oldfirst;
        n++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T item = first.newObject;
        first = first.next;
        n--;

        return item;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "StackList is empty";
        }
        StringBuilder s = new StringBuilder("\n");
        Node copyfirst = first;
        while (copyfirst != null) {
            s.append(copyfirst.newObject);
            s.append(", ");
            copyfirst = copyfirst.next;
        }
        s.replace(s.length() - 2, s.length(), "");
        return s.toString();
    }

}
