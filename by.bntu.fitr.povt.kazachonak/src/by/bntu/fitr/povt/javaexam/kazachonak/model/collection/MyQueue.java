package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import java.util.NoSuchElementException;

public class MyQueue<T> extends MyList<T> {

    protected Node last;

    public MyQueue() {
        first = null;
        last = null;
        n = 0;
    }

    @Override
    public void push(T newObject) {
        Node oldlast = last;
        last = new Node();
        last.newObject = newObject;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
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
        if (isEmpty()) {
            last = null;
        }
        return item;
    }
}
