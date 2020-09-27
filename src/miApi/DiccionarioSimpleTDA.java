package miApi;

public interface DiccionarioSimpleTDA {
	
	/**
	 * Inicializa el diccionario
	 */
	
    void inicializarDiccionarioSimple();
    
    /**
     * Permite agregar una clave con un valor, ambos suministrados. 
     * @precond El diccionario debe estar inicializado y la clave no debe existir.
     * @param clave
     * @param valor
     */

    void agregar(int clave, int valor);
    
    /**
     * Permite eliminar una clave suministrada. 
     * @precond La clave debe existir.
     * @param clave
     */

    void eliminar(int clave);
    
    /**
     * Devuelve el valor asociado a una clave suministrada. No elimina el valor.
     * @precond La clave debe existir
     * @param clave
     * @return valor
     */

    int obtener(int clave);
    
    /**
     * Devuelve el conjunto de claves del diccionario. No elimina las claves. 
     * @precond El diccionario debe estar inicializado
     * @return Conjunto de claves
     */

    ConjuntoTDA claves();
}
