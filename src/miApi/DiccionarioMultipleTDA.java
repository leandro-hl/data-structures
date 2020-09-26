package miApi;

public interface DiccionarioMultipleTDA {
	
	
	/**
	 * inicializa el diccionario
	 */
    void inicializarDiccionarioMultiple();
    
    /**
     * Agrega un valor a una clave, ambos datos suministrados. Si no existe la clave, se agrega.
     * @precond El diccionario debe estar inicializado y el valor no debe existir para esa clave. 
     * @param clave
     * @param valor
     */

    void agregar(int clave, int valor);
    
    /**
     * Elimina una clave suministrada junto con los valores asociados. 
     * @precond La clave debe existir
     * @param clave
     */

    void eliminar(int clave);
    
    /**
     * Elimina un valor asociado a una clave, ambos datos suministrados. 
     * @precond Ambos deben existir.
     * @param clave
     * @param valor
     */

    void eliminarValor(int clave, int valor);
    
    /**
     * Devuelve el conjunto de valores asociados a una clave suministrada. No elimina los valores. 
     * @precond La clave debe existir
     * @param clave
     * @return valores
     */

    ConjuntoTDA obtener(int clave);
    
    
    /**
     * Devuelve el conjunto de claves del diccionario. No elimina las claves. 
     * @precond El diccionario debe estar inicializado
     * @return conjunto de claves
     */

    ConjuntoTDA claves();


}
