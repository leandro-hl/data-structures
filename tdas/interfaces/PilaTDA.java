package tdas.interfaces;

import tdas.helpers.ImprimirTDA;

public interface PilaTDA extends ImprimirTDA<PilaTDA> {
    void apilar(int x);

    void desapilar();

    int tope();

    boolean pilaVacia();

    void inicializarPila();
}
