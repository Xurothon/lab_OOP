package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

import java.util.Collection;

public interface MyCollection<T> extends Collection<T>{

    void push(T newObject);

    T pop();

    T peek();

    @Override
    int size();
}
