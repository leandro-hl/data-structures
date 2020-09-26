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

    @Override
    public void imprimirValores() {
        ColaTDA aux = new ColaCircular();
        aux.inicializarCola();

        while (!this.colaVacia()){
            System.out.println(this.primero());
            aux.acolar(this.primero());
            this.desacolar();
        }

        while (!aux.colaVacia()){
            this.acolar(aux.primero());
            aux.desacolar();
        }
    }

    @Override
    public void imprimirComparativa(ColaTDA comparar) {
        ColaTDA auxMisValores = new ColaCircular();
        ColaTDA auxSusValores = new ColaCircular();
        auxMisValores.inicializarCola();
        auxSusValores.inicializarCola();

        System.out.println("[ Cola 1, Cola 2 ]");
        while (!this.colaVacia()){
            System.out.println("[ " + this.primero() + ", " + comparar.primero() + " ]");
            auxMisValores.acolar(this.primero());
            auxSusValores.acolar(comparar.primero());
            this.desacolar();
            comparar.desacolar();
        }

        while (!auxMisValores.colaVacia()){
            this.acolar(auxMisValores.primero());
            auxMisValores.desacolar();
        }

        while (!auxSusValores.colaVacia()){
            comparar.acolar(auxSusValores.primero());
            auxSusValores.desacolar();
        }
    }
}
