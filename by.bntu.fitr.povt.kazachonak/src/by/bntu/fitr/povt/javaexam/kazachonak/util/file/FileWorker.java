package by.bntu.fitr.povt.javaexam.kazachonak.util.file;

import java.io.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class FileWorker {

    private static final Logger log = LogManager.getLogger(FileWorker.class);

    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            log.error(e.toString());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsoluteFile(), true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
            log.error(e.toString());
        }
    }

    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        try {
            exists(file);
        } catch (FileNotFoundException e) {
            log.error(e.toString());
        }
        try (BufferedReader reader = new BufferedReader(
                new FileReader(file.getAbsoluteFile()))) {
            int c;
            while ((c = reader.read()) != -1) {
                sb.append((char) c);
            }
        } catch (IOException e) {
            log.error(e.toString());
        }
        return sb.toString();
    }

    public static String readLine(String fileName, int lineRead) {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        try {
            exists(file);
        } catch (FileNotFoundException e) {
            log.error(e.toString());
        }
        try (BufferedReader reader = new BufferedReader(
                new FileReader(file.getAbsoluteFile()))) {
            for (int i = 0; i < lineRead - 1; i++) {
                reader.readLine();
            }
            sb.append(reader.readLine());
        } catch (IOException e) {
            log.error(e.toString());
        }

        return sb.toString();
    }

    private static void exists(File file) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
    }
}