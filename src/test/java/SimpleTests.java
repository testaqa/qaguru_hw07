import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
        assertTrue(true);
    }

    @Test
    @Tag("smoke")
    void FourthTest() {
        assertTrue(true);
    }

    @Test
    @Tag("smoke")
    void FifthTest() {
        assertTrue(true);
    }

}
