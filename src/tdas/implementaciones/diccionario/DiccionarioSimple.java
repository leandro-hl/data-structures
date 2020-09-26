package tdas.implementaciones.diccionario;

import tdas.implementaciones.conjunto.Conjunto;
import tdas.interfaces.ConjuntoTDA;
import tdas.interfaces.DiccionarioSimpleTDA;

public class DiccionarioSimple implements DiccionarioSimpleTDA {
    private class Elemento {
        int clave;
        int valor;

        public Elemento(int clave, int valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }

    private Elemento[] elementos;
    private int cantidad;

    @Override
    public void inicializarDiccionarioSimple() {
        this.elementos = new Elemento[100];
        this.cantidad = 0;
    }

    @Override
    public void agregar(int clave, int valor) {
        this.elementos[this.cantidad] = new Elemento(clave, valor);
        this.cantidad++;
    }

    @Override
    public void eliminar(int clave) {
        int indice = 0;

        while (clave != elementos[indice].clave){
            indice++;
        }

        while (indice < cantidad - 1) {
            elementos[indice] = elementos[indice + 1];
            indice++;
        }

        cantidad--;
    }

    @Override
    public int obtener(int clave) {
        int indice = 0;

        while (clave != elementos[indice].clave){
            indice++;
        }

        return elementos[indice].valor;
    }

    @Override
    public ConjuntoTDA claves() {
        ConjuntoTDA claves = new Conjunto();

        for (int i = 0; i < cantidad; i++) {
            claves.agregar(this.elementos[i].clave);
        }

        return claves;
    }
}
