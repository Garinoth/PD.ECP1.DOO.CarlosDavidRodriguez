package biblioteca.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrestamoTest {
    
    private Prestamo prestamo;
    private Libro libro;
    private Usuario usuario;
    
    @Before
    public void before() {
        this.usuario = new Usuario("Nombre");
        this.libro = new Libro ("Nombre del libro", "Autor", 1584);
        this.prestamo = new Prestamo(usuario, libro);
    }

    @Test
    public void testPrestamo() {
        assertEquals(this.usuario, this.prestamo.getUsuario());
        assertEquals(this.libro, this.prestamo.getLibro());
    }

}
