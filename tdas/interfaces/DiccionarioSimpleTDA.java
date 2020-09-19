package tdas.interfaces;

public interface DiccionarioSimpleTDA {
    void inicializarDiccionario();

    void agregar(int clave, int valor);

    void eliminar(int clave);

    int obtener(int clave);

    ConjuntoTDA claves();
}
