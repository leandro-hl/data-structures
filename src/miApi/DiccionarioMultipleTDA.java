package miApi;

public interface DiccionarioMultipleTDA {
    void inicializarDiccionarioMultiple();

    void agregar(int clave, int valor);

    void eliminar(int clave);

    void eliminarValor(int clave, int valor);

    ConjuntoTDA obtener(int clave);

    ConjuntoTDA claves();
}
