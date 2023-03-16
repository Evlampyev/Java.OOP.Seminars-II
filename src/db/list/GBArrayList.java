package db.list;

import db.GBList;


import java.util.Iterator;

public class GBArrayList<T> implements GBList<T> {

    private T[] values;
    int count = 0;

    public GBArrayList() {
        this.values = (T[]) new Object[10];
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayIterator<>(values);
    }

    @Override
    public int leng() {
        return values.length;
    }

    @Override
    public T get(int index) {
        return values[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void update(int index, T t) {
        values[index] = t;
    }

    @Override
    public boolean add(T t) {
        if (count < values.length - 1) {
            count++;
            values[count] = t;
        } else {
            try {
                T[] temp = values;
                values = (T[]) new Object[temp.length + (int) (temp.length / 2)];
                System.arraycopy(temp, 0, values, 0, temp.length); //копирование из temp c позиции 0 в массив values
                // c позиции 0 temp.length элементов
                count++;
                values[count] = t;
                return true;
            } catch (ClassCastException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public void remove(int index) {
        try {
            T[] temp = values;
            values = (T[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, values, 0, index);
            int elementAfterIndex = temp.length - index - 1;
            System.arraycopy(temp, index + 1, values, index, elementAfterIndex);
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }

    }
}