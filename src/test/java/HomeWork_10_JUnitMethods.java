import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeWork_10_JUnitMethods {

    @Test
    public void concatWithSymTest() {

        String res = HomeWork_10_MethodsForTest.concatWithSym("hello", "money", '#');
        assertEquals("hello#money", res);

        res = HomeWork_10_MethodsForTest.concatWithSym("Java", "Test", '-');
        assertEquals("Java-Test", res);

        res = HomeWork_10_MethodsForTest.concatWithSym("", "money", '#');
        assertEquals("#money", res);

        res = HomeWork_10_MethodsForTest.concatWithSym("hello", "", '#');
        assertEquals("hello#", res);

        res = HomeWork_10_MethodsForTest.concatWithSym("A", "B", ' ');
        assertEquals("A B", res);

        // negative
        res = HomeWork_10_MethodsForTest.concatWithSym(null, "money", '#');
        assertNull(res);

        res = HomeWork_10_MethodsForTest.concatWithSym("hello", null, '#');
        assertNull(res);

        res = HomeWork_10_MethodsForTest.concatWithSym(null, null, '#');
        assertNull(res);
    }

    @Test
    public void concatStrsTest() {

//                      0        1      2        3
        String[] ar1 = {"hello", "bye", "money", "happy"};

//                      0      1       2
        String[] ar2 = {"yes", "no", "maybe"};

        String res = HomeWork_10_MethodsForTest.concatStrs(ar1, ar2, 2, 1);
        assertEquals("moneyno", res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, ar2, 0, 0);
        assertEquals("helloyes", res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, ar2, 1, 2);
        assertEquals("byemaybe", res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, ar2, 3, 0);
        assertEquals("happyyes", res);

//                      0        1       2
        String[] ar3 = {"hi", "", "life"};

//                      0     1
        String[] ar4 = {"ok", " "};

        res = HomeWork_10_MethodsForTest.concatStrs(ar3, ar4, 1, 0);
        assertEquals("ok", res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar3, ar4, 2, 1);
        assertEquals("life ", res);

        // negative
        res = HomeWork_10_MethodsForTest.concatStrs(null, ar2, 1, 1);
        assertNull(res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, null, 1, 1);
        assertNull(res);

        String[] emptyAr = {};
        res = HomeWork_10_MethodsForTest.concatStrs(emptyAr, ar2, 0, 1);
        assertNull(res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, emptyAr, 0, 1);
        assertNull(res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, ar2, -1, 1);
        assertNull(res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, ar2, 1, -1);
        assertNull(res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, ar2, 4, 1);
        assertNull(res);

        res = HomeWork_10_MethodsForTest.concatStrs(ar1, ar2, 1, 3);
        assertNull(res);

        String[] arWithNull1 = {"hello", null, "money"};
        res = HomeWork_10_MethodsForTest.concatStrs(arWithNull1, ar2, 1, 1);
        assertNull(res);

        String[] arWithNull2 = {"yes", null, "maybe"};
        res = HomeWork_10_MethodsForTest.concatStrs(ar1, arWithNull2, 1, 1);
        assertNull(res);
    }
}
