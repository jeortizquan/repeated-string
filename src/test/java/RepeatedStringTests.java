import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedStringTests {
    @Test
    public void testCaseExample(){
        assertEquals( 4, Result.repeatedString("abcac",10) );
    }

    @Test
    public void testCase0(){
        assertEquals( 7, Result.repeatedString("aba",10) );
    }

    @Test
    public void testCase1(){
        assertEquals( 1000000000000L, Result.repeatedString("a",1000000000000L) );
    }

    @Test
    public void testCase2(){
        assertEquals( 1333333333333L, Result.repeatedString("aba",2000000000000L) );
    }
}
