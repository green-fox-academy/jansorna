import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SharpieTest {

    Sharpie mySharpie;
    Sharpie mySharpie2;

    @Before
    public void methodBefore(){
        mySharpie = new Sharpie("blue", 10f);
        mySharpie = new Sharpie(null, null);
    }

    @Test
    public void Sharpie_initializingNewSharpie_toBeInitialized(){
        assertNotNull(mySharpie);
    }

    @Test
    public void Sharpie_initializingNewNullSharpie_toNotBeInitialized(){
        assertNull(mySharpie2);
    }

    @Test
    public void Sharpie_initializedSharpieHasCorrectInkAmount_InkAmountEquals100(){
        float correctInkAmount = 100f;
        assertEquals( correctInkAmount, mySharpie.inkAmount, 0);
    }

    @Test
    public void use_inputSharpie_InkAmountIsDecreasing(){
        mySharpie.use();
        assertEquals(99,mySharpie.inkAmount ,0);
    }
}
