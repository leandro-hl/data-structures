package tdas.interfaces;

import tdas.helpers.ImprimirTDA;

public interface ColaTDA extends ImprimirTDA<ColaTDA> {
    void inicializarCola();

    void acolar(int x);

    void desacolar();

    boolean colaVacia();

    int primero();
}
