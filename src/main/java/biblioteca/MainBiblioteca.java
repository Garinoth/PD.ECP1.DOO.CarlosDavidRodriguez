package biblioteca;

import upm.jbb.IO;
import biblioteca.models.GestorLibros;
import biblioteca.models.GestorPrestamos;
import biblioteca.models.GestorUsuarios;
import biblioteca.models.Libro;
import biblioteca.models.Prestamo;
import biblioteca.models.Usuario;

public class MainBiblioteca {
    
    private GestorPrestamos gestorPrestamos;
    private GestorLibros gestorLibros;
    private GestorUsuarios gestorUsuarios;
    
    public MainBiblioteca() {
        this.gestorPrestamos = new GestorPrestamos();
        this.gestorLibros = new GestorLibros();
        this.gestorUsuarios = new GestorUsuarios();
    }
    
    public void añadirLibro() {
        String titulo = IO.in.readString("Introduzca nombre");
        String autor = IO.in.readString("Introduzca autor");
        Integer isbn = Integer.parseInt(IO.in.readString("Introduzca isbn"));
        this.gestorLibros.add(new Libro(titulo, autor, isbn));
    }
    
    public void añadirUsuario() {
        String name = IO.in.readString("Introduzca nombre");
        this.gestorUsuarios.add(new Usuario(name));
    }
    
    public void añadirPrestamo() {
        Libro libro = (Libro) IO.in.select(gestorLibros.getColleccion().toArray());
        Usuario usuario = (Usuario) IO.in.select(gestorUsuarios.getColleccion().toArray());;
        this.gestorPrestamos.add(new Prestamo(usuario, libro));
    }
    
    public void mostrarAlmacenes() {
        IO.out.print("Libros: ");
        for (Libro l : this.gestorLibros.getColleccion()) {
            IO.out.print(l.toString());
        }
        IO.out.println();
        IO.out.print("Usuarios: ");
        for (Usuario u : this.gestorUsuarios.getColleccion()) {
            IO.out.print(u.toString());
        }
        IO.out.println();
        IO.out.print("Prestamos: ");
        for (Prestamo p : this.gestorPrestamos.getColleccion()) {
            IO.out.print(p.toString());
        }
        IO.out.println();
    }

    public static void main(String[] args) {
        IO.in.addController(new MainBiblioteca());
    }

}
