package Ise;

public class Nodo {
    Object dato;
    Nodo siguiente;

    public Nodo(Object dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Object getdato() {

        return dato;
    }

    public void setDato(Object dato) {

        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
