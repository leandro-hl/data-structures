package tdas.implementaciones.pila;

import tdas.interfaces.PilaTDA;

public class Pila implements PilaTDA {

    private int[] vector;
    private int posicion;

    @Override
    public void apilar(int x) {
        vector[posicion] = x;
        posicion += 1;
    }

    @Override
    public void desapilar() {
        posicion -= 1;
    }

    @Override
    public int tope() {
        return vector[posicion - 1];
    }

    @Override
    public boolean pilaVacia() {
        return posicion == 0;
    }

    @Override
    public void inicializarPila() {
        vector = new int[100];
        posicion = 0;
    }

    @Override
    public void imprimirValores() {
        PilaTDA aux = new Pila();
        aux.inicializarPila();

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
