package by.bntu.fitr.povt.javaexam.kazachonak.model.collection;

public interface ICollection<T> {
    void push(T newObject);
    T pop();
    T peek();
}
