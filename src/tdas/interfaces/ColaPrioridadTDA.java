package tdas.interfaces;

public interface ColaPrioridadTDA {
    void inicializarCola();

    /**
     * @precond La estructura debe estar inicializada.
     * @param x El elemento a acolar
     * @param p La prioridad del elemento
     */
    void acolarPrioridad(int x, int p);

    /**
     * @precond La estructura no debe estar vacía.
     */
    void desacolar();

    /**
     * @precond La estructura debe estar inicializada.
     * @return
     */
    boolean colaVacia();

    /**
     * @precond La estructura no debe estar vacía.
     * @return
     */
    int primero();

    /**
     * @precond La estructura no debe estar vacía.
     * @return La prioridad del dato de mayor prioridad
     */
    int prioridad();
}
