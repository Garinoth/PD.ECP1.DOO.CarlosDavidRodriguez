package operationsCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest extends OperationTest {
    
    private Multiplication multiplication;
    
    @Before
    public void before() {
        this.multiplication = new Multiplication(3, 5);
    }

    @Test
    public void testOperate() {
        assertEquals(15, this.multiplication.operate(), 10e-1);
    }

}
