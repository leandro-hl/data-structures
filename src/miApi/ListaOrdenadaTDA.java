package miApi;

/**
 * Solo difiere de la ListaTDA el metodo Agregar
 * Dado que vamos ingresando siempre por inicio
 * y reordenando a medida que lo hacemos.
 */
public interface ListaOrdenadaTDA {
    void agregar(int valor);
    
    void inicializarLista();

    void eliminarInicio();

    void eliminarFinal();

    void eliminar(int valor);

    boolean existe(int valor);

    ColaTDA valores();

    boolean listaVacia();
}
