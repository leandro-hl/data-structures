package miApi;

/**
 * No repetidos y No necesariamente ordenados.
 */
public interface ConjuntoTDA {
    void agregar(int x);

    void sacar(int x);

    int obtener();

    boolean conjuntoVacio();

    boolean pertenece(int x);

    void inicializarConjunto();
}
