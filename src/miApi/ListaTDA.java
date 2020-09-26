package miApi;

public interface ListaTDA {
    void agregarInicio(int valor);

    void agregarFinal(int valor);
    
    void inicializarLista();

    void eliminarInicio();

    void eliminarFinal();

    void eliminar(int valor);

    boolean existe(int valor);

    ColaTDA valores();

    boolean listaVacia();
}
