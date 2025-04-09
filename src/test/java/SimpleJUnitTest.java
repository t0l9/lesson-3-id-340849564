import org.junit.jupiter.api.*;

public class SimpleJUnitTest {


    @BeforeEach
    void beforeEach(){
        System.out.println("перед каждым тестом");
    }

    void afterEach(){
        System.out.println("После каждого теста");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("Один раз перед всеми тестами в классе");

    }

    @AfterAll
    static void afterAll(){
        System.out.println("Один раз после всеми тестами в классе");

    }


    @Test
    void firstTest(){
        System.out.println("Hello");
        Assertions.assertTrue(3>2);
    }
}
