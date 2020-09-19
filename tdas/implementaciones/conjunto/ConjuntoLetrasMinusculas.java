package tdas.implementaciones.conjunto;

import tdas.interfaces.ConjuntoCharTDA;
import tdas.interfaces.ConjuntoTDA;

import java.util.Random;

public class ConjuntoLetrasMinusculas implements ConjuntoCharTDA {

    private boolean[] vector;
    private char cantidadElementos;
    private int cotaInferior;
    private int cotaSuperior;
    private Random random;

    @Override
    public void inicializarConjunto() {
        cotaSuperior = 'z';
        cotaInferior = 'a';

        int total = cotaSuperior - cotaInferior + 1;
        vector = new boolean[total];

        //suponiendo que no se inicializan en false by default
        for (int i = 0; i < total; i++) {
            vector[i] = false;
        }

        cantidadElementos = 0;
        random = new Random(System.currentTimeMillis());
    }

    @Override
    public void agregar(char x) {
        if (!pertenece(x)) {
            vector[x - cotaInferior] = true;
            cantidadElementos++;
        }
    }

    @Override
    public void sacar(char x) {
        vector[x - cotaInferior] = false;
        cantidadElementos--;
    }

    @Override
    public char elegir() {
        int ascii = random.nextInt(cantidadElementos) + cotaInferior;

        while (cantidadElementos > 0 && !vector[ascii]){
            ascii = random.nextInt(cantidadElementos) + cotaInferior;
        }

        return (char)ascii;
    }

    @Override
    public boolean conjuntoVacio() {
        return cantidadElementos == 0;
    }

    @Override
    public boolean pertenece(char x) {
        return vector[x - cotaInferior];
    }
}
