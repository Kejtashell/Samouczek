package testyProba;

import org.junit.jupiter.api.*;

public class TestLifeCycle {

    @BeforeEach
    public void setUp() {
        System.out.println("set up");
        System.out.flush();
    }

    @AfterEach
    public void tearDown() {
        System.out.println("tear down");
        System.out.flush();
    }

    @BeforeAll
    public static void setUpClass() {
        System.out.println("set up class");
        System.out.flush();
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("tear down class");
        System.out.flush();
    }

    @Test
    public void test1() {
        System.out.println("test 1");
        System.out.flush();
    }

    @Test
    public void test2() {
        System.out.println("test 2");
        System.out.flush();
    }
}
