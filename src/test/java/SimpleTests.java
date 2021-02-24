import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTests {

    @Test
    void FirstTest() {
        assertTrue(true);
    }

    @Test
    void SecondTest() {
        assertTrue(true);
    }

    @Test
    void ThirdTest() {
        step("Step one", () -> {
            System.out.println("Hello world");
        });
        step("Step one", () -> {
            assertTrue(false);
        });
    }

    @Test
    @Tag("smoke")
    void FourthTest() {
        step("Step one", () -> {
            System.out.println("Hello world");
        });
        step("Step one", () -> {
            assertTrue(true);
        });
    }

    @Test
    @Tag("smoke")
    void FifthTest() {
        assertTrue(true);
    }

}
