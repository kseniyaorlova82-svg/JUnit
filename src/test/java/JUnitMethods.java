import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitMethods {

    @Test
    public void concatStringArray(){
//                       0      1   2       3      4   5
        String[] ar = {"hello","","money","happy"," ",null};

        String res = MethodsForTest.concatStringArray(ar,0,2);
        assertEquals("hellomoney",res);
        res = MethodsForTest.concatStringArray(ar,0,0);
        assertEquals("hellohello",res);
        res = MethodsForTest.concatStringArray(ar,1,2);
        assertEquals("money",res);
        res = MethodsForTest.concatStringArray(ar,3,4);
        assertEquals("happy ",res);
        res = MethodsForTest.concatStringArray(ar,4,3);
        assertEquals(" happy",res);

        res = MethodsForTest.concatStringArray(null,1,4);
        assertNull(res);
        res = MethodsForTest.concatStringArray(ar,0,6);
        assertNull(res);

        String[]ar1 ={};
        res = MethodsForTest.concatStringArray(ar1,1,4);
        assertNull(res);
        String[]ar2 ={"hi","hello","life"};
        res = MethodsForTest.concatStringArray(ar2,1,2);
        assertEquals("hellolife",res);
        String[]ar3 ={"hi","hello","life","\n"};
        res = MethodsForTest.concatStringArray(ar3,1,2);
        assertEquals("hellolife",res);
        res = MethodsForTest.concatStringArray(ar,-1,2);
        assertNull(res);
        res = MethodsForTest.concatStringArray(ar,1,5);
        assertNull(res);
        res = MethodsForTest.concatStringArray(ar,2,-2);
        assertNull(res);

    }
    @Test
    public void sumElementsArray(){

    }

}