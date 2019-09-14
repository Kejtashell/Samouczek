package testyProba;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import testyJednostkowe.Range;


import static org.junit.jupiter.api.Assertions.*;

class RangeTest {

    Range range;

    @BeforeEach
    public void tworzymyObiekt () {
         range =  new Range (10,20);
        System.out.println("before each");
    }

    @Test
    public void test1 () {
        assertTrue(range.isInRange(15));
        System.out.println("test 1");
    }

    @Test
    void isInRange() {

        assertFalse(range.isInRange(1));
        System.out.println("test 2");

    }

    @Test
    public void shouldThrownIllegalArgumentExceptionOnWrongParameters() {

        try {
            new Range(15, 10);
            fail("no exception");
        }

        catch (IllegalArgumentException exception) {
            assertEquals("lower bound should be lower", exception.getMessage());

        }

        finally {
            System.out.println("test 3");
        }
    }

@AfterEach
    public void poPtokach () {
    System.out.println("afterek");
}

}