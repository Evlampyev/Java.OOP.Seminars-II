import db.GBList;
import db.list.GBArrayList;
import org.junit.jupiter.params.provider.NullEnum;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> gbList = new GBArrayList<>();
        gbList.add(2);
        gbList.add(3);
        gbList.add(4);
        gbList.add(2);
        gbList.add(3);
        gbList.add(4);
        gbList.add(2);
        gbList.add(3);
        gbList.add(4);
        gbList.add(7);
        gbList.add(8);
        gbList.add(9);
        System.out.println("Текущее количество элементов " + gbList.size());
        System.out.println("Размер массива " + gbList.leng());
        System.out.println("Элемент с индексом 0 - " + gbList.get(0));

        for (Integer x : gbList) {
            if (x != null) {
                System.out.printf(x + " ");
            }
        }
        gbList.remove(2);

    }
}
