package operationsCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SummationTest extends OperationTest {
    
    private Summation summation;
    
    @Before
    public void before() {
        this.summation = new Summation(3, 5);
    }

    @Test
    public void testOperate() {
        assertEquals(8, this.summation.operate(), 10e-1);
    }

}
