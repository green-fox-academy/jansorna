
import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {

    @Test
    public void getApple_initializeNewApple_toBeInitialiyed() {
        Apple testedApple = new Apple();

        String result = testedApple.getApple();
        assertEquals("apple", result);
    }
}
