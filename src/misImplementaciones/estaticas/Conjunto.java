package misImplementaciones.estaticas;

import java.util.Random;

import miApi.ConjuntoTDA;

public class Conjunto implements ConjuntoTDA {

    private int[] vector;
    private int cantidadElementos;
    private Random random;

    @Override
    public void inicializarConjunto() {
        vector = new int[100];
        cantidadElementos = 0;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public void agregar(int x) {
    	vector[cantidadElementos] = x;
        cantidadElementos++;
        
    }

    @Override
    public void sacar(int x) {
        int ultimo = cantidadElementos - 1;
        int indice = ultimo;
        
        while (indice >= 0 && vector[indice] != x) {
            indice--;
        }
        //utilizamos la posicion del elemento a eliminar para
        //guardar el elemento en la ultima posicion del conjunto.
        //asi, no queda un espacio vacio en medio del conjunto
        vector[indice] = vector[ultimo];
        cantidadElementos--;
    }

    @Override
    public int obtener() {
        return vector[random.nextInt(cantidadElementos)];
    }

    @Override
    public boolean conjuntoVacio() {
        return cantidadElementos == 0;
    }

    @Override
    public boolean pertenece(int x) {
		int i = 0;
		while(i<cantidadElementos && vector[i]!=x) {
			i++;
		}
		return (i<cantidadElementos);
	}
}
