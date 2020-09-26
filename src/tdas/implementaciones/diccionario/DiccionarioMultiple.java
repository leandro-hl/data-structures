package tdas.implementaciones.diccionario;

import tdas.implementaciones.conjunto.Conjunto;
import tdas.interfaces.ConjuntoTDA;
import tdas.interfaces.DiccionarioMultipleTDA;

public class DiccionarioMultiple implements DiccionarioMultipleTDA {
    private class ClaveMultiple {
        int clave;
        int[] valores;
        int cantidadValores;

        public ClaveMultiple(int clave, int valor) {
            this.clave = clave;
            this.valores = new int[100];
            this.valores[0] = valor;
            this.cantidadValores = 1;
        }
    }

    private ClaveMultiple[] claves;
    private int cantidadClaves;

    @Override
    public void inicializarDiccionarioMultiple() {
        this.claves = new ClaveMultiple[100];
        this.cantidadClaves = 0;
    }

    @Override
    public void agregar(int clave, int valor) {
        ConjuntoTDA claves = claves();

        if (claves.pertenece(clave)) {
            int indice = 0;

            while (clave != this.claves[indice].clave) {
                indice++;
            }

            this.claves[indice].valores[this.claves[indice].cantidadValores] = valor;
            this.claves[indice].cantidadValores++;
        } else {
            this.claves[this.cantidadClaves] = new ClaveMultiple(clave, valor);
            this.cantidadClaves++;
        }
    }

    @Override
    public void eliminar(int clave) {
        int indice = 0;

        while (clave != claves[indice].clave) {
            indice++;
        }

        while (indice < cantidadClaves - 1) {
            claves[indice] = claves[indice + 1];
            indice++;
        }

        cantidadClaves--;
    }

    @Override
    public void eliminarValor(int clave, int valor) {
        int indice = 0;

        while (clave != claves[indice].clave) {
            indice++;
        }

        int indiceValor = 0;

        while (valor != claves[indice].valores[indiceValor]) {
            indiceValor++;
        }

        while (indiceValor < claves[indice].cantidadValores - 1) {
            claves[indice].valores[indiceValor] = claves[indice].valores[indiceValor + 1];
            indiceValor++;
        }

        claves[indice].cantidadValores--;
    }

    @Override
    public ConjuntoTDA obtener(int clave) {
        int indice = 0;

        while (clave != claves[indice].clave) {
            indice++;
        }

        ConjuntoTDA valores = new Conjunto();

        for (int i = 0; i < claves[indice].valores.length; i++) {
            valores.agregar(claves[indice].valores[i]);
        }

        return valores;
    }

    @Override
    public ConjuntoTDA claves() {
        ConjuntoTDA claves = new Conjunto();

        for (int i = 0; i < cantidadClaves; i++) {
            claves.agregar(this.claves[i].clave);
        }

        return claves;
    }
}
