package by.bntu.fitr.povt.javaexam.kazachonak.view;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintManager {

    private final static Map<String, Printable> views = new LinkedHashMap<>();

    static {
        PrintManager.add("Console", new ConsolePrint());
        PrintManager.add("File", new FilePrint("data/outputfile.txt"));
    }

    public static Printable get(String key) {
        return views.get(key);
    }

    public static void add(String key, Printable value) {
        views.put(key, value);
    }
}
