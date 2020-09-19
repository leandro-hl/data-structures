package tdas.implementaciones.cola;

import tdas.interfaces.ColaTDA;

public class ColaPrimeroInicio implements ColaTDA {
    public int[] vector;
    private int poner;

    public void inicializarCola() {
        vector = new int[100];
        poner = 0;
    }

    @Override
    public void acolar(int x) {
        vector[poner] = x;
        poner++;
    }

    @Override
    public void desacolar() {
        for (int i = 0; i < poner - 1; i++) {
            vector[i] = vector[i + 1];
        }

        poner--;
    }

    @Override
    public boolean colaVacia() {
        return poner == 0;
    }

    @Override
    public int primero() {
        return vector[0];
    }

    @Override
    public void imprimirValores() {

    }

    @Override
    public void imprimirComparativa(ColaTDA comparar) {

    }
}
