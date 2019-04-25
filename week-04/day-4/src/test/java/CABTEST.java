import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CABTEST {
    CAB myCAB;

    @Before
    public void beforeMethod() {
        int[] code = {1, 2, 3, 4};
        myCAB = new CAB(code);
    }

    @Test
    public void CAB_ifCABIsCreated_CABIsCreated() {
        assertNotNull(myCAB);
    }

    @Test
    public void CAB_testIfCodeIsCreated_CodeIsCreated() {
        assertNotNull(myCAB.code);
    }

    @Test
    public void guess_inputGuessWithFullMatch_cowCount4andbullCount0() {
        myCAB.guess(1, 2, 3, 4);
        assertEquals(4, myCAB.cowCount);
        assertEquals(0, myCAB.bullCount);
        assertEquals("Finished", myCAB.stateOfTheGame);
    }

    @Test
    public void guess_inputGuessWithPartialMatch_cowCount2andbullCount2() {
        myCAB.guess(3, 2, 1, 4);
        assertEquals(2, myCAB.cowCount);
        assertEquals(2, myCAB.bullCount);
        assertEquals("Playing", myCAB.stateOfTheGame);
    }

    @Test
    public void guess_inputGuessWithNoMatch_cowCount0andbullCount0() {
        myCAB.guess(7, 8, 9, 6);
        assertEquals(0, myCAB.cowCount);
        assertEquals(0, myCAB.bullCount);
        assertEquals("Playing", myCAB.stateOfTheGame);
    }

    @Test
    public void setStateOfTheGame_changeTheStateOfTheGame_stateIsChanged() {
        myCAB.setStateOfTheGame("Destroyed");
        assertEquals("Destroyed", myCAB.stateOfTheGame);
    }
}
