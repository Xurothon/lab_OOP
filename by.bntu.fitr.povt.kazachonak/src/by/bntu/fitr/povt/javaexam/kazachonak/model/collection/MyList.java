package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class MyList<T> extends AbstractCollection<T> implements MyCollection<T> {

    protected MyList() {
    }

    protected int n;
    protected Node first;

    protected class Node {

        protected T newObject;
        protected Node next;
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.newObject;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node copyfirst = first;
        while (copyfirst != null) {
            s.append(copyfirst.newObject).append(", ");
            copyfirst = copyfirst.next;
        }
        s.replace(s.length() - 2, s.length(), "");
        return s.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<T> {

        private Node next = first;
        private Node lastReturned;
        private int nextIndex;

        @Override
        public boolean hasNext() {
            return nextIndex < size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.newObject;
        }
    }
}
