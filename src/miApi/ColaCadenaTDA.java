package miApi;

/**
 * Estructura de datos necesaria para Tabla
 */
public interface ColaCadenaTDA {
    void inicializarCola();

    /**
     * @precond La estructura debe estar inicializada.
     * @param x
     */
    void acolar(String x);

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
    String primero();
}
