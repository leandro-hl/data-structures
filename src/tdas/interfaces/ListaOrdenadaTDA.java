package tdas.interfaces;

/**
 * Solo difiere de la ListaTDA el metodo Agregar
 * Dado que vamos ingresando siempre por inicio
 * y reordenando a medida que lo hacemos.
 */
public interface ListaOrdenadaTDA extends ListaBaseTDA{
    void agregar(int valor);
}
