package misImplementaciones.dinamicas;

import miApi.ColaCadenaTDA;

// PRIMERO AL INICIO
public class ColaCadenaDinamica implements ColaCadenaTDA {

	class Node{
		String d;
		Node sig;	
	}
	
	private Node inicio,fin;
	
	
	//Todas las implementaciones a continuacion son dinamicas
	////////////////////////////////////////////////
	
	/**
	 * Orden de complejidad: 1 
	 */
	@Override
	public void inicializarCola() {
		inicio = fin = null;
	}

	/**
	 * Orden de complejidad: 1
	 */
	
	@Override
	public void acolar(String x) {
		Node n = new Node();
		n.d = x;
		n.sig = null;
		if(inicio == null) {
			inicio = fin = n;
		}
		else {
			fin.sig = n;
			fin=n;
		}
	}
	
	/**
	 * Orden de complejidad: 1
	 */

	@Override
	public void desacolar() {
		inicio = inicio.sig;
		if(inicio == null) {
			fin = null;
		}
	}
	
	/**
	 * Orden de complejidad: 1
	 */
	@Override
	public boolean colaVacia() {
		return inicio == null;
	}
	
	/**
	 * Orden de complejidad: 1
	 */

	@Override
	public String primero() {
		return inicio.d;
	}

}
