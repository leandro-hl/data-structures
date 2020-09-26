package misImplementaciones.estaticas;

import miApi.PilaTDA;

public class PilaTopeInicio implements PilaTDA {
    private int[] vector;
    private int posicion;

    @Override
    public void apilar(int x) {
        for (int i = posicion; i > 0; i--) {
            vector[i] = vector[i - 1];
        }

        vector[0] = x;
        posicion++;
    }

    @Override
    public void desapilar() {
        for (int i = 0; i < posicion - 1; i++) {
            vector[i] = vector[i + 1];
        }

        posicion--;
    }

    @Override
    public int tope() {
        return vector[0];
    }

    @Override
    public boolean pilaVacia() {
        return posicion == 0;
    }

    @Override
    public void inicializarPila() {
        vector = new int[100];
        posicion = 0;
    }

}
