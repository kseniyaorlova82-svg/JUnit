import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodsJunitTest {

    public static String insertFrom(String s, int index, String ins){
        StringBuilder sb = new StringBuilder(s);
        sb.insert(index,ins);
        return sb.toString();
    }
    public static boolean isPalindrome(String s){
        if(s == null || s.isBlank() || s.isEmpty()){
            return false;
        }
        s = s.replace(" ","");
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = sb.toString();
        return s.equalsIgnoreCase(rev);
    }
    @Test
    public void testIsPalindrom(){
        boolean res = MethodsJunitTest.isPalindrome("level");
        assertTrue(res);
        //positive tests -> true
        res = MethodsJunitTest.isPalindrome(" level  ");
        assertTrue(res);
        res = MethodsJunitTest.isPalindrome("LeVel");
        assertTrue(res);
        res = MethodsJunitTest.isPalindrome("5level5");
        assertTrue(res);
        res = MethodsJunitTest.isPalindrome("242");
        assertTrue(res);
        res = MethodsJunitTest.isPalindrome("Name now one man");
        assertTrue(res);
        res = MethodsJunitTest.isPalindrome("\"Name now one man\"");
        assertTrue(res);

        //negative tests -> false
        res = MethodsJunitTest.isPalindrome(null);
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("");
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("  ");
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("Hello");
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("123");
        assertFalse(res);
        res = MethodsJunitTest.isPalindrome("Level_");
        assertFalse(res);




    }
    @Test
    public void testInsertForm(){
        //fail("Not yet implemented");
    }

}
//    assertFalse(isPalindrome("hello"));
//    assertTrue(isPalindrome("level"));