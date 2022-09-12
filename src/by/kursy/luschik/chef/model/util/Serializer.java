package by.kursy.luschik.chef.model.util;

import java.io.*;

public class Serializer<T> {
    private String fileName = "c:/test/salad.bin";

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void serialize(T t) {
        try (ObjectOutputStream stream = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(fileName)))) {

            stream.writeObject(t);
            stream.flush();

        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public T deserialize() {
        T t = null;

        try (ObjectInputStream stream = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream(fileName)))) {

            t = (T) stream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println(e);
        }
        return t;
    }
}
