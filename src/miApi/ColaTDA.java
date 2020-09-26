package miApi;

public interface ColaTDA {
	
    void inicializarCola();

    /**
     * @precond La estructura debe estar inicializada.
     * @param x
     */
    void acolar(int x);

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
}
