package biblioteca.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorPrestamosTest extends GestorTest<Prestamo> {
    
    private GestorPrestamos gestor;
    
    @Before
    public void before() {
        this.gestor = new GestorPrestamos();
    }
    
    @Test
    public void testGestorUsuarios() {
        assertEquals(0, this.gestor.getColleccion().size());
    }

    @Override
    public void testAdd() {
        Usuario usuario = new Usuario("Knuckles");
        Libro libro = new Libro("titulo", "autor", 0);
        Prestamo prestamo = new Prestamo(usuario, libro);
        this.gestor.add(prestamo);
        assertTrue(this.gestor.getColleccion().contains(prestamo));
    }

    @Override
    public void testRemove() {
        Usuario usuario = new Usuario("Knuckles");
        Libro libro = new Libro("titulo", "autor", 0);
        Prestamo prestamo = new Prestamo(usuario, libro);
        this.gestor.add(prestamo);
        this.gestor.remove(prestamo);
        assertEquals(0, this.gestor.getColleccion().size());
    }

    @Override
    public void testGetCollection() {
        Usuario usuario = new Usuario("Knuckles");
        Libro libro = new Libro("titulo", "autor", 0);
        Prestamo prestamo = new Prestamo(usuario, libro);
        Usuario usuario2 = new Usuario("Tails");
        Libro libro2 = new Libro("titulo2", "autor2", 0);
        Prestamo prestamo2 = new Prestamo(usuario2, libro2);
        this.gestor.add(prestamo);
        this.gestor.add(prestamo2);
        assertEquals(2, this.gestor.getColleccion().size());        
    }
    
}
