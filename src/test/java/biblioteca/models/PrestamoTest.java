package biblioteca.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrestamoTest {
    
    private Prestamo prestamo;
    
    @Before
    public void before() {
        Usuario usuario = new Usuario("Nombre");
        Libro libro = new Libro ("Nombre del libro", "Autor", 1584);
        this.prestamo = new Prestamo(usuario, libro);
    }

    @Test
    public void test() {
        fail("Not yet implemented");
    }

}
