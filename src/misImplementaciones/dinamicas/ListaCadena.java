package misImplementaciones.dinamicas;

import miApi.ColaTDA;
import miApi.ListaCadenaTDA;
import misImplementaciones.estaticas.ColaCircular;

//Implementacion dimanica

public class ListaCadena implements ListaCadenaTDA {
    class Nodo {
        String valor;
        Nodo siguiente;

        public Nodo(String valor) {
            this.valor = valor;
            this.siguiente = null;
        }
    }

    Nodo inicio;

    /**
     * Orden de complejidad: 1
     */
    
    
    @Override
    public void inicializarLista() {
        inicio = null;
    }

    /**
     * Orden de complejidad: 1
     */
    
    
    @Override
    public void agregarInicio(String valor) {
        Nodo nuevoNodo = new Nodo(valor);

        nuevoNodo.siguiente = inicio;

        inicio = nuevoNodo;
    }
    
    /**
     * Orden de complejidad: 1
     */
    

    @Override
    public void agregarFinal(String valor) {
        if (listaVacia()) {
            agregarInicio(valor);
            return;
        }

        Nodo nuevoNodo = new Nodo(valor);
        Nodo actual = inicio;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevoNodo;
    }

    /**
     * Orden de complejidad: 1
     */
    
    
    @Override
    public void eliminarInicio() {
        if (!listaVacia()) {
            inicio = inicio.siguiente;
        }
    }
    
    /**
     * Orden de complejidad: 1
     */
    

    @Override
    public void eliminarFinal() {
        if (listaVacia()) {
            return;
        }

        if (inicio.siguiente == null) {
            eliminarInicio();
            return;
        }

        Nodo actual = inicio;
        Nodo anterior = null;

        while (actual.siguiente != null) {
            anterior = actual;
            actual = actual.siguiente;
        }

        anterior.siguiente = null;
    }
    
    /**
     * Orden de complejidad: 1
     */
    

    @Override
    public void eliminar(String valor) {
        if (listaVacia()) {
            return;
        }

        if (inicio.valor == valor) {
            eliminarInicio();
        }

        Nodo actual = inicio;
        Nodo anterior = null;

        while (actual != null && actual.valor != valor) {
            anterior = actual;
            actual = actual.siguiente;
        }

        //si llegamos a que el actual sea null, es xq no se encontro el valor
        if (actual != null) {
            anterior.siguiente = actual.siguiente;
        }
    }

    /**
     * Orden de complejidad: 1
     */
    
    
    @Override
    public boolean existe(String valor) {
        Nodo actual = inicio;

        while (actual != null && actual.valor != valor) {
            actual = actual.siguiente;
        }

        return actual == null;
    }
    
    /**
     * Orden de complejidad: 1
     */
    

    @Override
    public ColaCadena valores() {
        ColaCadena valores; //Falta implementación
        valores.inicializarCola();

        Nodo actual = inicio;

        while (actual != null) {
            valores.acolar(actual.valor);
            actual = actual.siguiente;
        }

        return valores;
    }

    /**
     * Orden de complejidad: 1
     */
    
    
    @Override
    public boolean listaVacia() {
        return inicio == null;
    }
}
