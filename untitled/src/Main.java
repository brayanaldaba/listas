import Icse.ListaCircular;
import Ide.ListaDoblementeEnlazada;
import lcde.ListaCircularDoblementeEnlasada;
import pc.Cola;
import pc.Pila;

//import  Ise.Lista_enlazada;
public class Main {
    public static  void main(String[] args){
        /*

        Lista_enlazada Lista_enlazada = new Lista_enlazada();
        System.out.println(Lista_enlazada.estaVacia());
        Lista_enlazada.insertar(5);
        Lista_enlazada.insertar(4);
        Lista_enlazada.insertar(3);
        Lista_enlazada.insertar(2);
        Lista_enlazada.insertar(1);
        Lista_enlazada.insertar(0);

        Lista_enlazada.mostrar();
        Lista_enlazada.eliminar();
        Lista_enlazada.eliminar();
        Lista_enlazada.mostrar();


        ListaDoblementeEnlazada listaDoblementeEnlazada = new ListaDoblementeEnlazada();
        System.out.println(listaDoblementeEnlazada.estaVacia());
        for(int i = 20; i > 0; i--){
            listaDoblementeEnlazada.insertar(i);
        }
        System.out.println(listaDoblementeEnlazada.estaVacia());
        listaDoblementeEnlazada.mostrarAdelante();

        listaDoblementeEnlazada.eliminar();
        listaDoblementeEnlazada.eliminar();

        listaDoblementeEnlazada.mostrarAdelante();
         listaDoblementeEnlazada.mostrarAtras();

        ListaCircular listaCircular = new ListaCircular();
        System.out.println(listaCircular.estaVacia());
        System.out.println(listaCircular.tamaño());
        for (int i = 1; i <= 12; i++){
            listaCircular.insertarFin(i);
        }
        listaCircular.mostrar();
        System.out.println(listaCircular.tamaño());
       // listaCircular.eliminar();
        //listaCircular.eliminar();
        //listaCircular.mostrar();
listaCircular.mostrarCircular( 2);


        ListaCircularDoblementeEnlasada listaCircularDoblementeEnlasada = new ListaCircularDoblementeEnlasada();
    System.out.println(listaCircularDoblementeEnlasada.estaVacia());
    for (int i= 1; i <= 5; i ++ ){
        listaCircularDoblementeEnlasada.insertarFinal(i);
    }
        listaCircularDoblementeEnlasada.mostrar();

    listaCircularDoblementeEnlasada.eliminarFinal();
            listaCircularDoblementeEnlasada.eliminarFinal();
        listaCircularDoblementeEnlasada.mostrar();

                listaCircularDoblementeEnlasada.mostrarAdelante( 8);
        listaCircularDoblementeEnlasada.mostrarAtras(8);

        Cola cola = new Cola();
        System.out.println(cola.estaVacia());
        for (int i = 1;i <=5 ; i++ ){
            cola.insertar(i);
        }
        cola.mostrar();
        cola.eliminar();
        cola.eliminar();
        cola.mostrar();
        */
        Pila pila = new Pila();
        System.out.println(pila.estaVacia());
        for (int i = 1; i<=5;i++ ){
            pila.insertar(i);
        }
        pila.mostrar();
         pila.eliminar();
         pila.eliminar();
         pila.eliminar();
         pila.mostrar();
    }

}
