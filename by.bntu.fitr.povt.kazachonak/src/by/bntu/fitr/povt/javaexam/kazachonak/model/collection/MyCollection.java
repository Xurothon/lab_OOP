package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

public interface MyCollection<T> {

    void push(T newObject);

    T pop();

    T peek();
    
    int size();

}
