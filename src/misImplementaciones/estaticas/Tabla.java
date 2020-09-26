package misImplementaciones.estaticas;

import miApi.ColaCadenaTDA;
import miApi.ColaTDA;
import miApi.TablaTDA;

/**
 * Implementación de Tabla estática (100 elementos máximo)
 */
public class Tabla implements TablaTDA {
    
    private String[] elementos;
    private int ultimo;

    @Override
    public void inicializarTabla() {
        this.elementos = new String[100];
        this.ultimo = 0;
    }

    @Override
    public void agregar(String nombre) {
        elementos[ultimo] = nombre;
        this.ultimo++;
    }

    @Override
    public boolean pertenece(int codigo) {
        return this.ultimo > codigo;
    }

    @Override
    public int codigo(String nombre) {
        String elementoEncontrado = this.elementos[0];
        for (int i = 0; elementoEncontrado != nombre; i++) {
            elementoEncontrado = this.elementos[i];
        }
        return elementoEncontrado;
    }

    @Override
    public ColaTDA valores() {
        ColaCadenaTDA valores; // Falta la implementación de ColaCadena.
        valores.inicializarCola();
        for (int i = 0; i < ultimo; i++) {
            valores.acolar(i + ";" + this.elementos[i]);
        }
        return valores;
    }

    @Override
    public void ordenarNombres() {
        // Falta ver ABB
    }

    @Override
    public void ordenarCodigos() {
        // Falta ver ABB
    }

    @Override
    public boolean estaVacia() {
        return this.ultimo == 0;
    }
    
}
