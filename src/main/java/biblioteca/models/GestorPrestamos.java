package biblioteca.models;

import java.util.Iterator;

public class GestorPrestamos extends Gestor<Prestamo> {

    public boolean isPrestado(Libro libro) {
        boolean prestado = false;
        Iterator<Prestamo> iterator = this.getColleccion().iterator();
        Prestamo current;
        while (iterator.hasNext() && !prestado) {
            current = iterator.next();
            prestado = current.getLibro().equals(libro);
        }
        return prestado;
    }
}
