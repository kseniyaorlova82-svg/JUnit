public class HomeWork_9_MethodsForTest {

    public static int parseAndSum(String s1, String s2) {

        try {

            if (s1 == null || s2 == null
                    || s1.isEmpty()
                    || s2.isEmpty()) {

                return 0;
            }

            return Integer.parseInt(s1)
                    + Integer.parseInt(s2);

        } catch (Exception e) {

            return 0;
        }
    }
}
