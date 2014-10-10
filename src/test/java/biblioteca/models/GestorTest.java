package biblioteca.models;

import org.junit.Test;

public abstract class GestorTest<E> {

    @Test
    public abstract void testAdd();

    @Test
    public abstract void testRemove();
    
    @Test
    public abstract void testGetCollection();
    
}
