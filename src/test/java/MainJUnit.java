import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainJUnit {
    public static void main(String[] args) {
        int a = 5, b = 5;
        assertTrue(a == b);
        assertFalse(a != b);

        String s1 ="Hello", s2 = "Hello";
        assertEquals(s2,s1);
        //assertNotEquals(s2,s1);

        String s3 = null;
        assertNull(s3);
        //assertNotNull(s3);

        //fail("failed");

        System.out.println("the end");

    }

    public static class JUnitMethods {

        @Test
        public void concatStringArray() {
         //                    0    1    2       3     4
            String[] ar = {"hello","","money","happy"," "};
            String res = MethodsForTest.concatStringArray(ar,0,2);
            assertEquals("hellomoney",res);
            res = MethodsForTest.concatStringArray(ar,0,0);
            assertEquals("hellohello",res);
            res = MethodsForTest.concatStringArray(ar,1,2);
            assertEquals("money",res);
            res = MethodsForTest.concatStringArray(ar,3,4);
            assertEquals("happy ",res);
        }

        @Test
        public void sumElementsArray(){


        }
    }
}
















//        int a = 5, b = 3;
//        assertTrue(a == b);
//
//        System.out.println("the end");













//         int a = 5, b = 3;
//         assertFalse(a == b);
//
//         System.out.println("the end");