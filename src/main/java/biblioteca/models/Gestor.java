package biblioteca.models;

import java.util.HashSet;

public abstract class Gestor<E> {

    private HashSet<E> colleccion;
    
    public Gestor() {
        this.colleccion = new HashSet<E>();
    }
    
    public void add(E item) {
        this.colleccion.add(item);
    }
    
    public void remove(E item) {
        assert this.colleccion.contains(item);
        this.colleccion.remove(item);
    }
    
    public HashSet<E> getColleccion() {
        return this.colleccion;
    }
}
