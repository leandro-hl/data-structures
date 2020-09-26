package misImplementaciones.estaticas;

import miApi.ColaTDA;

public class ColaCircular implements ColaTDA {
    public int[] vector;
    private int poner, sacar;

    public void inicializarCola() {
        vector = new int[101];
        poner = sacar = 0;
    }

    public void acolar(int x) {
        vector[poner] = x;
        poner++;
        if (poner == 101)
            poner = 0;
    }

    public void desacolar() {
        sacar++;
        if (sacar == 101) {
            sacar = 0;
        }
    }

    public boolean colaVacia() {
        return sacar == poner;
    }

    public int primero() {
        return vector[sacar];
    }

}
