package operationsCollection;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OperationsTest {
    
    private Operations operations;
    
    @Before
    public void before() {
        this.operations = new Operations();
        operations.add(new Summation(3, 6));
        operations.add(new Substraction(3, 2));
        operations.add(new Multiplication(5, 7));
    }

    @Test
    public void testTotal() {
        assertEquals(45, this.operations.total(), 10e-1);
    }
    
    @Test
    public void testReset() {
        operations.reset();
        assertEquals(0, this.operations.total(), 10e-1);
    }

}
