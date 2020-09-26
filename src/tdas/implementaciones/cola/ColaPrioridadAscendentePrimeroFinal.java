package tdas.implementaciones.cola;

import tdas.interfaces.ColaPrioridadTDA;
import tdas.interfaces.ColaTDA;

public class ColaPrioridadAscendentePrimeroFinal implements ColaPrioridadTDA {
    public Elemento[] vector;
    private int poner;

    public void inicializarCola() {
        vector = new Elemento[100];
        poner = 0;
    }

    @Override
    public void acolarPrioridad(int x, int prioridad) {
        int ultimo = poner - 1;

        while (ultimo >= 0 && prioridad < vector[ultimo].prioridad) {
            //si el ultimo tiene una prioridad mayor
            //al elemento a insertar,
            //muevo el ultimo una posicion hacia adelante
            //y chequeo el elemento siguiente hacia abajo.
            vector[ultimo + 1] = vector[ultimo];
            ultimo--;
        }

        vector[ultimo + 1] = new Elemento(x, prioridad);
        poner++;
    }

    @Override
    public void desacolar() {
        poner--;
    }

    @Override
    public boolean colaVacia() {
        return poner == 0;
    }

    @Override
    public int primero() {
        return vector[poner].valor;
    }

    @Override
    public int prioridad() {
        return vector[poner].prioridad;
    }

    public void imprimirValores() {

    }

    public void imprimirComparativa(ColaTDA comparar) {

    }

    class Elemento {
        public Elemento(int valor, int prioridad) {
            this.valor = valor;
            this.prioridad = prioridad;
        }

        int valor;
        int prioridad;
    }
}
