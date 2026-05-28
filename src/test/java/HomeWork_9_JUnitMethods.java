import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomeWork_9_JUnitMethods {

    @Test
    public void parsAndSum() {

        String s1;
        String s2;

        int res;

        // positive tests

        s1 = "7";
        s2 = "8";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(15, res);

        s1 = "15";
        s2 = "25";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(40, res);

        s1 = "2";
        s2 = "0";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(2, res);

        s1 = "0";
        s2 = "11";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(11, res);

        s1 = "-8";
        s2 = "3";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(-5, res);

        s1 = "-4";
        s2 = "-6";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(-10, res);

        s1 = "50";
        s2 = "70";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(120, res);

        s1 = "0007";
        s2 = "0008";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(15, res);

        s1 = "+2";
        s2 = "+13";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(15, res);


        // negative tests

        s1 = null;
        s2 = "9";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "9";
        s2 = null;
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = null;
        s2 = null;
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "";
        s2 = "6";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "6";
        s2 = "";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "";
        s2 = "";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = " ";
        s2 = "4";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "4";
        s2 = " ";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = " ";
        s2 = " ";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "cat";
        s2 = "9";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "9";
        s2 = "dog";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "cat";
        s2 = "dog";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "test";
        s2 = "18";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "Java2026";
        s2 = "11";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "55a";
        s2 = "1";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "2.7";
        s2 = "1";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "2,7";
        s2 = "1";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "3 4";
        s2 = "5";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "-";
        s2 = "8";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "+";
        s2 = "8";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "@@@";
        s2 = "9";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "***";
        s2 = "8";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "???";
        s2 = "5";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "###";
        s2 = "6";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "\t";
        s2 = "7";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "\n";
        s2 = "7";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);

        s1 = "777777777777777777";
        s2 = "2";
        res = HomeWork_9_MethodsForTest.parseAndSum(s1, s2);
        assertEquals(0, res);
    }
}