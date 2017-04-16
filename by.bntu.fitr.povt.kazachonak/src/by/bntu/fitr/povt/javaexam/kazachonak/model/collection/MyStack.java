package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import java.util.NoSuchElementException;

public class MyStack<T> extends MyList<T> {

    public MyStack() {
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
}
