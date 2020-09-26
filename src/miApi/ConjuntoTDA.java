package miApi;

/**
 * No repetidos y no necesariamente ordenados.
 */
public interface ConjuntoTDA {
	
	
	/**
	 * agrega un elemento suministrado. 
	 * @precond El conjunto debe estar inicializado y el elemento no debe existir
	 * @param x Elemento a agregar en el conjunto
	 */
    void agregar(int x);

    /**
     * Elimina un elemento suministrado. 
     * @precond El elemento debe pertenecer al conjunto.
     * @param x
     */
    
    void sacar(int x);
    
    /**
     * Devuelve un valor cualquiera del conjunto. El elemento no se elimina. 
     * @precond El conjunto no debe estar vacío.
     * @return Valor
     */
    

    int obtener();
    
    
    /**
     * Devuelve verdadero si el conjunto no tiene elementos.
     * @precond El conjunto debe estar inicializado
     * @return True 
     */

    boolean conjuntoVacio();
    
    /**
     * Devuelve verdadero si el valor suministrado pertenece al conjunto. 
     * @precond El conjunto debe estar inicializado
     * @param x Elemento a analizar
     * @return True or False
     */

    boolean pertenece(int x);
    /**
     * Inicializa el conjunto
     */
    void inicializarConjunto();
}
