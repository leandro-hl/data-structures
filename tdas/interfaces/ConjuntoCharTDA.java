package tdas.interfaces;

public interface ConjuntoCharTDA {
    void agregar(char x);

    void sacar(char x);

    char elegir();

    boolean conjuntoVacio();

    boolean pertenece(char x);

    void inicializarConjunto();
}
