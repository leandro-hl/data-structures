package miApi;

public interface GrafoTDA {
    void inicializarGrafo();

    /**
     * @precond El grafo debe estar inicializado
     * @precond El vértice no debe existir
     * @param vertice El vértice a agregar
     */
    void agregarVertice(int vertice);

    /**
     * @precond El vértice debe existir
     * @param vertice
     */
    void eliminarVertice(int vertice);

    /**
     * @precond Los vértices deben existir
     * @precond No debe existir la arista
     * @param verticeOrigen El origen de esta arista
     * @param verticeDestino El destino de esta arista
     * @param peso El peso de la arista
     */
    void agregarArista(int verticeOrigen, int verticeDestino, int peso);

    /**
     * @precond La arista debe existir
     * @param verticeOrigen El origen de esta arista
     * @param verticeDestino El destino de esta arista
     */
    void eliminarArista(int verticeOrigen, int verticeDestino);

    /**
     * @precond El grafo debe estar inicializado
     * @return El conjunto de vértices
     */
    ConjuntoTDA vertices();

    /**
     * @precond La arista debe existir
     * @param verticeOrigen El origen de esta arista
     * @param verticeDestino El destino de esta arista
     * @return El peso de la arista
     */
    int peso(int verticeOrigen, int verticeDestino);

    /**
     * @precond El grafo debe estar inicializado
     * @param verticeOrigen El origen de esta arista
     * @param verticeDestino El destino de esta arista
     * @return Si existe la arista
     */
    boolean existeArista(int verticeOrigen, int verticeDestino);
}
