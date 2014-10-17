package biblioteca.models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {

    private Usuario usuario;
    
    @Before
    public void before() {
        this.usuario = new Usuario("Nombre");
    }

    @Test
    public void testUsuario() {
        assertEquals("Nombre", this.usuario.getName());
    }

}
