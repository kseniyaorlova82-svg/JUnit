public class HomeWork_10_MethodsForTest {

    public static String concatWithSym(String s1,
                                       String s2,
                                       char sym) {

        if (s1 == null || s2 == null) {
            return null;
        }

        return s1 + sym + s2;
    }

    public static String concatStrs(String[] ar1,
                                    String[] ar2,
                                    int index1,
                                    int index2) {

        if (ar1 == null
                || ar2 == null
                || ar1.length == 0
                || ar2.length == 0
                || index1 < 0
                || index2 < 0
                || index1 >= ar1.length
                || index2 >= ar2.length
                || ar1[index1] == null
                || ar2[index2] == null) {

            return null;
        }

        return ar1[index1] + ar2[index2];
    }
}