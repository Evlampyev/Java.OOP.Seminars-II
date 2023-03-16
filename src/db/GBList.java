package db;

public interface GBList<T> extends Iterable<T> {
    boolean add(T t);

    void remove(int index);

    T get(int index);

    int size();

    void update(int index, T t);

    int leng();
}
