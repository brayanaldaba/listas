package Ise;

public class Lista_enlazada {
   protected Nodo primero;
   protected Nodo ultimo;
    public Lista_enlazada() {
         primero = null;
    }


    public  boolean estaVacia() {
        return primero == null;
    }


    public void insertar(Object dato) {
        if (estaVacia()) {
           Nodo nuevo = new Nodo(dato,  null);
            primero = nuevo;
        } else {
            Nodo nuevo = new Nodo(dato, primero);
            primero = nuevo;
        }

    }

    public void eliminar() {
        if (!estaVacia()) {
            primero = primero.getSiguiente();
        }

    }

    public void mostrar() {
        Nodo tmp =primero;
       while ( tmp != null) {
            System.out.print(tmp.getdato() + "      ");
            tmp = tmp.getSiguiente();
        }

        System.out.println();
    }
}
