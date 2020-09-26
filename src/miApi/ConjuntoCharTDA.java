package miApi;

public interface ConjuntoCharTDA {
    void agregar(char x);

    void sacar(char x);

    char obtener();

    boolean conjuntoVacio();

    boolean pertenece(char x);

    void inicializarConjunto();
}
