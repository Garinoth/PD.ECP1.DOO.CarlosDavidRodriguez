package biblioteca.models;

public class Libro {

    private String titulo;
    private String autor;
    private int isbn;
    
    public Libro(String titulo, String autor, int isbn) {
        super();
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }
    
    @Override
    public String toString() {
        return "Libro[" + titulo + ", " + autor + ", " + isbn +"]";
    }

}
