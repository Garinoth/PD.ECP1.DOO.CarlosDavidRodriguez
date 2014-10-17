package biblioteca.models;

import java.time.LocalDate;

public class Prestamo {
    
    private static final int PLAZO = 15;
    
    private Usuario usuario;
    private Libro libro;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = LocalDate.now();
        this.fechaFin = LocalDate.now().plusDays(Prestamo.PLAZO);
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public Libro getLibro() {
        return this.libro;
    }
    
    
}
