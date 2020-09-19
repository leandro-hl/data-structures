package tdas.implementaciones.pila;

import tdas.implementaciones.lista.Lista;
import tdas.interfaces.PilaTDA;

public class PilaDinamicaTopeFinal implements PilaTDA {
    class Nodo {
        int valor;
        Nodo siguiente;

        public Nodo(int valor){
            this.valor = valor;
        }
    }

    Nodo inicio;
    Nodo fin;

    @Override
    public void apilar(int x) {
        Nodo nuevo = new Nodo(x);

        if(pilaVacia()){
            inicio = fin = nuevo;
            return;
        }

        Nodo actual = inicio;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
        fin = nuevo;
    }

    @Override
    public void desapilar() {
        if (pilaVacia()) {
            return;
        }

        if (inicio.siguiente == null) {
            inicio = fin = null;
            return;
        }

        Nodo actual = inicio;
        Nodo anterior = null;

        while (actual.siguiente != null) {
            anterior = actual;
            actual = actual.siguiente;
        }

        anterior.siguiente = null;
        fin = anterior;
    }

    @Override
    public int tope() {
        return fin.valor;
    }

    @Override
    public boolean pilaVacia() {
        return inicio == null;
    }

    @Override
    public void inicializarPila() {
        inicio = fin = null;
    }

    @Override
    public void imprimirValores() {
        PilaTDA aux = new PilaDinamicaTopeFinal();

        while (!this.pilaVacia()) {
            System.out.println(this.tope());
            aux.apilar(this.tope());
            this.desapilar();
        }

        while (!aux.pilaVacia()) {
            this.apilar(aux.tope());
            aux.desapilar();
        }
    }

    @Override
    public void imprimirComparativa(PilaTDA comparar) {

    }
}
