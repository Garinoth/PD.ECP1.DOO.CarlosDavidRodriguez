package biblioteca.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorLibrosTest extends GestorTest<Libro> {

private GestorLibros gestor;
    
    @Before
    public void before() {
        this.gestor = new GestorLibros();
    }

    @Test
    public void testGestorUsuarios() {
        assertEquals(0, this.gestor.getColleccion().size());
    }

    @Override
    public void testAdd() {
        Libro libro = new Libro("Nombre del libro", "Autor", 1584);
        this.gestor.add(libro);
        assertTrue(this.gestor.getColleccion().contains(libro));;
    }

    @Override
    public void testRemove() {
        Libro libro = new Libro("Nombre del libro", "Autor", 1584);
        this.gestor.add(libro);
        this.gestor.remove(libro);
        assertEquals(0, this.gestor.getColleccion().size());
    }

    @Override
    public void testGetCollection() {
        // TODO Auto-generated method stub
        
    }

}
