package ua.org.oa.mrsuperdan;

public interface SimpleList {

    void add(String s);

    String get();

    String get(int id);

    String remove();

    String remove(int id);

    boolean delete();
}
