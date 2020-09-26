package miApi;

public interface DiccionarioSimpleTDA {
    void inicializarDiccionarioSimple();

    void agregar(int clave, int valor);

    void eliminar(int clave);

    int obtener(int clave);

    ConjuntoTDA claves();
}
