package ua.org.oa.mrsuperdan;

public class DynamicStringList implements SimpleList {
    private final int DEFAULT_SIZE = 15;

    private int index;
    private String[] array;

    public DynamicStringList() {
        array = new String[DEFAULT_SIZE];
        index = 0;
    }

    public DynamicStringList(int size) {
        array = new String[size];
        index = 0;
    }

    @Override
    public String toString() {
        if (index == 0) {
            return "Пустой массив";
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(i).append(": ");
            result.append(array[i]);
            result.append("\n");
        }
        return result.toString();
    }

    @Override
    public void add(String s) {
        array[index++] = s;
    }

    @Override
    public String get() {
        return array[index - 1];
    }

    @Override
    public String get(int id) {
        return array[id];
    }

    @Override
    public String remove() {
        index = index - 1;
        return array[index];
    }

    @Override
    public String remove(int id) {
        String result = array[id];
        array[id] = null;
        return result;
    }

    @Override
    public boolean delete() {
        index = 0;
        return true;
    }
}
