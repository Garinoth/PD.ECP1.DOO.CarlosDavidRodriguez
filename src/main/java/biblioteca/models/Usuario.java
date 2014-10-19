package biblioteca.models;

public class Usuario {
    
    private String name;
    
    public Usuario(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return "Usuario[" + name +"]";
    }
}
