package misImplementaciones.dinamicas;

import miApi.ColaCadenaTDA;
import miApi.TablaTDA;

public class TablaDinamica implements TablaTDA {

    private ListaCadena elementos;
    private int ultimo;

    @Override
    public void inicializarTabla() {
        this.elementos.inicializarLista();
        this.ultimo = 0;
    }

    @Override
    public void agregar(String nombre) {
        this.elementos.agregarInicio(nombre);
        this.ultimo++;
    }

    @Override
    public boolean pertenece(int codigo) {
        return this.ultimo > codigo;
    }

    @Override
    public int codigo(String nombre) {
        ColaCadenaTDA valores = this.elementos.valores();
        int codigo = 0;
        while(valores.primero() != nombre) {
            valores.desacolar();
            codigo++;
        }
        return codigo;
    }

    @Override
    public ColaCadenaTDA valores() {
        ColaCadenaTDA valores; // Falta implementacion
        valores.inicializarCola();
        ColaCadenaTDA valoresTabla = this.elementos.valores();
        int codigo = 0;
        while(!valoresTabla.colaVacia()) {
            valores.acolar(codigo + ";" + valoresTabla.primero());
            valoresTabla.desacolar();
            codigo++;
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
