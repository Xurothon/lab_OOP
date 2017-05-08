package by.bntu.fitr.povt.javaexam.kazachonak.view;

public class ConsolePrint implements Printable{
    @Override
    public void print(Object object) {
        System.out.print(object);
    }
}
