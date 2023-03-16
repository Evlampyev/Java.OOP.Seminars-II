package test;

import db.list.GBArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GBArrayListTest {
    @Test
    void getTest() {
        GBArrayList<String> str = new GBArrayList<>();
        str.add("3");
        assertEquals("3", str.get(1));
    }

    @Test
    void getNegativeTast() {
        GBArrayList<String> duble = new GBArrayList<>();
        duble.add("4");
        assertNotEquals("2", duble.get(1));
    }
}
