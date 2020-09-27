package miApi;

public interface TablaTDA {
	/**
	 * Inicializa tabla
	 */
	void inicializarTabla();
	/**
	 * Esta operaci�n agrega un elemento nuevo a la tabla, donde el c�digo corresponde a 
	 * la cantidad de elementos de la tabla antes de ingresar un nuevo nombre. Los c�digos ser�n �nicos y consecutivos.
	 * @precond El nombre no debe existir previamente en la tabla. 
	 * @precond La tabla debe estar inicializada.
	 * @param nombre
	 */
    void agregar(String nombre);
    
    /**
     *  Esta operaci�n permite saber si un nombre ya fue ingresado a la tabla. 
     *  @precond La tabla debe estar inicializada.
     * @param codigo
     * @return Si el elemento existe en la tabla o no.
     */
    boolean pertenece(int codigo);
    
    /**
     * Indica cu�l es el c�digo de un nombre suministrado (no se elimina).
     * @param nombre El nombre a buscar
     * @return El c�digo del nombre a buscar
     */
    int codigo(String nombre);
    
    /**
     * Devuelve los elementos en una estructura cola, donde cada elemento de la cola corresponde a la
     * concatenaci�n del c�digo y el nombre separado por el car�cter �;�.
     * @precond La tabla debe estar inicializada
     * @return Cola con los elementos de la tabla, con su c�digo y nombre separado por ";"
     */
    ColaCadenaTDA valores();
    
    /**
     * Ordena los elementos de la tabla, alfab�ticamente por los nombres
     * @precond  La tabla debe estar inicializada.
     */
    void ordenarNombres();
    
    /**
     * Ordena los elementos de la tabla por los c�digos, en forma ascendente.
     * @precond  La tabla debe estar inicializada.
     */
    void ordenarCodigos();
    
    /**
     * Informa si la tabla no tiene elementos.
     * @precond La tabla debe estar inicializada
     * @return Si la tabla est� vac�a
     */
    boolean estaVacia();
}
