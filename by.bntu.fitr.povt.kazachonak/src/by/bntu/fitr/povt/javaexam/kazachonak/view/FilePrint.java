package by.bntu.fitr.povt.javaexam.kazachonak.view;

import by.bntu.fitr.povt.javaexam.kazachonak.util.file.FileWorker;

public class FilePrint implements Printable {

    private final String fileName;

    public FilePrint(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void print(Object object) {
        FileWorker.write(fileName, object.toString());
    }
}
