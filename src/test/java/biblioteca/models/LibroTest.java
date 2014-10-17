package biblioteca.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LibroTest {
    
    private Libro libro;
    
    @Before
    public void before() {
        this.libro = new Libro ("Nombre del libro", "Autor", 1584);
    }

    @Test
    public void testLibro() {
        assertEquals("Nombre del libro", this.libro.getTitulo());
        assertEquals("Autor", this.libro.getAutor());
        assertEquals(1584, this.libro.getIsbn());
    }

}
