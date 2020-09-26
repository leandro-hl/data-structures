package miApi;

public interface TablaTDA {
	/**
	 * Inicializa tabla
	 */
	void inicializarTabla();
	/**
	 * Esta operación agrega un elemento nuevo a la tabla, donde el código corresponde a 
	 * la cantidad de elementos de la tabla antes de ingresar un nuevo nombre. Los códigos serán únicos y consecutivos.
	 * @precond El nombre no debe existir previamente en la tabla. 
	 * @precond La tabla debe estar inicializada.
	 * @param nombre
	 */
    void agregar(String nombre);
    
    /**
     *  Esta operación permite saber si un nombre ya fue ingresado a la tabla. 
     *  @precond La tabla debe estar inicializada.
     * @param codigo
     * @return Si el elemento existe en la tabla o no.
     */
    boolean pertenece(int codigo);
    
    /**
     * Indica cuál es el código de un nombre suministrado (no se elimina).
     * @param nombre El nombre a buscar
     * @return El código del nombre a buscar
     */
    int codigo(String nombre);
    
    /**
     * Devuelve los elementos en una estructura cola, donde cada elemento de la cola corresponde a la
     * concatenación del código y el nombre separado por el carácter “;”.
     * @precond La tabla debe estar inicializada
     * @return Cola con los elementos de la tabla, con su código y nombre separado por ";"
     */
    ColaTDA valores();
    
    /**
     * Ordena los elementos de la tabla, alfabéticamente por los nombres
     * @precond  La tabla debe estar inicializada.
     */
    void ordenarNombres();
    
    /**
     * Ordena los elementos de la tabla por los códigos, en forma ascendente.
     * @precond  La tabla debe estar inicializada.
     */
    void ordenarCodigos();
    
    /**
     * Informa si la tabla no tiene elementos.
     * @precond La tabla debe estar inicializada
     * @return Si la tabla está vacía
     */
    boolean estaVacia();
}
