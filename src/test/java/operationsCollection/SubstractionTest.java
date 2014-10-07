package operationsCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubstractionTest {
    
    private Subtraction susbtraction;
    
    @Before
    public void before() {
        this.susbtraction = new Subtraction(3, 5);
    }

    @Test
    public void testOperate() {
        assertEquals(-2, this.susbtraction.operate(), 10e-1);
    }

}
