package tdas.interfaces;

public interface ListaBaseTDA {
    void inicializarLista();

    void eliminarInicio();

    void eliminarFinal();

    void eliminar(int valor);

    boolean existe(int valor);

    ColaTDA valores();

    boolean listaVacia();
}
