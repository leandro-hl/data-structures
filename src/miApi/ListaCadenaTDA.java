package miApi;

public interface ListaCadenaTDA {
    void agregarInicio(String valor);

    void agregarFinal(String valor);
    
    void inicializarLista();

    void eliminarInicio();

    void eliminarFinal();

    void eliminar(String valor);

    boolean existe(String valor);

    ColaCadenaTDA valores();

    boolean listaVacia();
}
