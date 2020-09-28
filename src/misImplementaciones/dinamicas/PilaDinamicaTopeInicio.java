package misImplementaciones.dinamicas;

import miApi.PilaTDA;

//Implementacion Dinamica

public class PilaDinamicaTopeInicio implements PilaTDA {
    class Nodo {
        int valor;
        Nodo siguiente;

        public Nodo(int valor) {
            this.valor = valor;
        }
    }

    Nodo inicio;
    
    /**
     * Orden de complejidad: 1
     */
    

    @Override
    public void apilar(int x) {
        Nodo nuevo = new Nodo(x);

        nuevo.siguiente = this.inicio;

        this.inicio = nuevo;
    }
    
    /**
     * Orden de complejidad: 1
     */
    

    @Override
    public void desapilar() {
        if (this.inicio != null) {
            this.inicio = this.inicio.siguiente;
        }
    }
    
    /**
     * Orden de complejidad: 1
     */
    

    @Override
    public int tope() {
        return this.inicio.valor;
    }

    /**
     * Orden de complejidad: 1
     */
    
    
    @Override
    public boolean pilaVacia() {
        return this.inicio == null;
    }
    
    /**
     * Orden de complejidad: 1
     */
    

    @Override
    public void inicializarPila() {
        this.inicio = null;
    }

}
