import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class SumTest {

    List<Integer> myNumbers;
    List<Integer> myNumbers2;
    List<Integer> myNumbers3;

    Sum mySum;

    @Before
    public void beforeMethod() {
        this.myNumbers = new ArrayList<>();
        this.myNumbers2 = new ArrayList<>();
        this.myNumbers3 = new ArrayList<>();

        this.myNumbers.add(1);
        this.myNumbers.add(2);
        this.myNumbers.add(3);

        this.myNumbers3.add(1);
    }

    @Test
    public void Sum_inputListOfMyNumbers_toBeSummed() {
        mySum = new Sum(myNumbers);
        assertEquals(6, mySum.sumOfNumbersInList());
    }

    @Test
    public void Sum_inputListOfMyNumbers2EmptyList_toBeSummed() {
        mySum = new Sum(myNumbers2);
        assertEquals(0, mySum.sumOfNumbersInList());
    }

    @Test
    public void Sum_inputListOfMyNumbers3ListWith_toBeSummed() {
        mySum = new Sum(myNumbers3);
        assertEquals(1, mySum.sumOfNumbersInList());
    }

    @Test
    public void Sum_inputNull_doNotKnowWhatHappen() {
        mySum = new Sum(null);
        assertEquals(0, mySum.sumOfNumbersInList());
    }
}
