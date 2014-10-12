package biblioteca.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GestorUsuariosTest extends GestorTest<Usuario> {
    
    private GestorUsuarios gestor;
    
    @Before
    public void before() {
        this.gestor = new GestorUsuarios();
    }

    @Test
    public void testGestorUsuarios() {
        assertEquals(0, this.gestor.getColleccion().size());
    }

    @Override
    public void testAdd() {
        Usuario usuario = new Usuario("Mike");
        this.gestor.add(usuario);
        assertTrue(this.gestor.getColleccion().contains(usuario));
    }

    @Override
    public void testRemove() {
        Usuario usuario = new Usuario("Mike");
        this.gestor.add(usuario);
        this.gestor.remove(usuario);
        assertEquals(0, this.gestor.getColleccion().size());
    }

    @Override
    public void testGetCollection() {
        this.gestor.add(new Usuario("Blinky"));
        this.gestor.add(new Usuario("Pinky"));
        this.gestor.add(new Usuario("Inky"));
        this.gestor.add(new Usuario("Clyde"));
        assertEquals(4, this.gestor.getColleccion().size());        
    }

}
