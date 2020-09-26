package tdas.interfaces;

/**
 * Tipo de Dato Abstracto de un Árbol Binario de Búsqueda.
 */
public interface ABBTDA {
    /**
     * Inicializa el árbol
     */
    void inicializarABB();

    /**
     * @precond El árbol no puede estar vacío
     * @return El valor del elemento
     */
    int raiz();

    /**
     * @precond El árbol no puede estar vacío
     * @return La referencia del subárbol izquierdo
     */
    ABBTDA hijoIzq();
    
    /**
     * @precond El árbol no puede estar vacío
     * @return La referencia del subárbol derecho
     */
    ABBTDA hijoDer();

    /**
     * Agregar un valor suministrado
     * @param valor El valor a agregar
     */
    void agregar(int valor);

    /**
     * Elimina un valor suministrado
     * @precond El valor debe existir
     * @param valor El valor a eliminar
     */
    void eliminar(int valor);

    /**
     * @precond La estructura debe estar inicializada
     * @return Si el árbol está vacío
     */
    boolean arbolVacio();

    /**
     * @precond El árbol debe estar inicializado
     * @param valor El valor a buscar
     * @return Si el valor pertenece al árbol
     */
    boolean pertenece(int valor);
}
