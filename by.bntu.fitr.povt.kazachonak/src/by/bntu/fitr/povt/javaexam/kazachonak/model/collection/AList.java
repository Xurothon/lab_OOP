package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class AList<T> implements ICollection<T> {

    protected int n;
    protected Node first;

    protected class Node {

        protected T newObject;
        protected Node next;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return first == null;
    }

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
